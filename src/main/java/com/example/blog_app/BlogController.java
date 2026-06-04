package com.example.blog_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BlogController {
    private final BlogRepository blogRepository;
    private final BlogService blogService;

    public BlogController(BlogRepository blogRepository, BlogService blogService){
        this.blogRepository = blogRepository;
        this.blogService = blogService;
    }

    @GetMapping("/blogs")
    public String blogs(){
        return "blogs";
    }

    @GetMapping("/blogs/Post")
    public String newBlog(@ModelAttribute BrogForm Brogform){
        return "blogs/Post";
    }
}
