package vincenzomola.u5_w2_l2_WebService.services;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import vincenzomola.u5_w2_l2_WebService.entities.Blog;
import vincenzomola.u5_w2_l2_WebService.payloads.BlogPostsPayload;
import vincenzomola.u5_w2_l2_WebService.payloads.BlogPostsResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogPostsServices {

    private List<Blog> blogPostsFromDb = new ArrayList<>();

    public List<Blog> findAll() {
        return this.blogPostsFromDb;
    }

    public BlogPostsResponsePayload createBlogPosts(BlogPostsPayload body) {
        Blog newBlog = new Blog(body.getCategoria(), body.getTitolo(), body.getContenuto(), body.getTempoDiLettura());
        blogPostsFromDb.add(newBlog);
        System.out.println("Il post con titolo" + newBlog.getTitolo() + " é stato creato");
        return new BlogPostsResponsePayload(newBlog.getId(), newBlog.getCategoria(), newBlog.getTitolo(),
                newBlog.getContenuto(), newBlog.getTempoDiLettura(), newBlog.getCover());
    }

    public Blog findById(long blogPostId) {
        Blog found = null;

        for (Blog blog : this.blogPostsFromDb) {
            if (blog.getId() == blogPostId) found = blog;
        }

        if (found == null) throw new RuntimeException("Blog non trovato");
        return found;
    }

    public BlogPostsResponsePayload modifyBlogPostById(BlogPostsPayload body, long blogPostsId) {
        Blog found = null;

        for (Blog blog : this.blogPostsFromDb) {
            if (blog.getId() == blogPostsId) {
                found = blog;
                found.setTitolo(body.getTitolo());
                found.setCategoria(body.getCategoria());
                found.setTempoDiLettura(body.getTempoDiLettura());
            }
        }
        if (found == null) throw new RuntimeException("Blog non trovato");

        return new BlogPostsResponsePayload(found.getId(), found.getCategoria(),
                found.getTitolo(), found.getContenuto(), found.getTempoDiLettura(), found.getCover());
    }
}
