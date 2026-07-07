package vincenzomola.u5_w2_l2_WebService.controllers;

import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vincenzomola.u5_w2_l2_WebService.entities.Blog;
import vincenzomola.u5_w2_l2_WebService.payloads.BlogPostsPayload;
import vincenzomola.u5_w2_l2_WebService.payloads.BlogPostsResponsePayload;
import vincenzomola.u5_w2_l2_WebService.services.BlogPostsServices;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogController {

    private final BlogPostsServices blogPostsServices;

    public BlogController(BlogPostsServices blogPostsServices) {
        this.blogPostsServices = blogPostsServices;
    }

    @GetMapping
    public List<Blog> findAll() {
        return this.blogPostsServices.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BlogPostsResponsePayload createBlogPosts(@RequestBody BlogPostsPayload body) {
        return this.blogPostsServices.createBlogPosts(body);
    }

    @GetMapping("/{blogPostId}")
    public Blog findById(@PathVariable long blogPostId) {
        return this.blogPostsServices.findById(blogPostId);
    }

    @PutMapping("/{blogPostId}")
    public BlogPostsResponsePayload modifyBlogPosts(@RequestBody BlogPostsPayload body, @PathVariable long blogPostId) {
        return this.blogPostsServices.modifyBlogPostById(body, blogPostId);
    }

}
