package com.example.blog_app;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {
    private final BlogRepository blogRepository;
    private final BlogService blogService;

    public BlogController(BlogRepository blogRepository, BlogService blogService){
        this.blogRepository = blogRepository;
        this.blogService = blogService;
    }

    @GetMapping("/blogs")
    public String blogs(Model model){
        List<Blog> blogs = blogRepository.findAll();
        model.addAttribute("blogs", blogs);
        return "blogs";
    }

    @PostMapping("/blogs")
    public String post(BlogForm form){
        blogService.resister(form);
        return "redirect:/blogs";
    }

    @GetMapping("/blogs/Post")
    public String newBlog(@ModelAttribute BlogForm Blogform){
        return "blogs/Post";
    }

    @GetMapping("/blogs/{id}")
    public String detail(@PathVariable Long id, Model model){
        Optional<Blog> blogOpt = blogService.findById(id);
        if(blogOpt.isEmpty()){
            return "redirect:/blogs";
        }
        model.addAttribute("blog", blogOpt.get());
        return "blogs/personal";
    }
}
