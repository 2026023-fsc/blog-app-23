package com.example.blog_app;

import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    private final BlogRepository blogRepository;
    public BlogService(BlogRepository blogRepository){
        this.blogRepository = blogRepository;
    }

    public void resister(BlogForm form){
        Blog blog = new Blog(form.getName(), null, form.getTitle(), form.getMainText(), null);
        blogRepository.save(blog);
    }

    public Optional<Blog> findById(Long id){
        return blogRepository.findById(id);
    }
}
