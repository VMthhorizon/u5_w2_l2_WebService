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

    public Blog createBlogPosts(BlogPostsResponsePayload body) {
        Blog newBlog = new Blog(body.getCategoria(), body.getTitolo(), body.getContenuto(), body.getTempoDiLettura());
        blogPostsFromDb.add(newBlog);
        System.out.println("Il post con titolo" + newBlog.getTitolo() + " é stato creato");
        return newBlog;
    }
}
