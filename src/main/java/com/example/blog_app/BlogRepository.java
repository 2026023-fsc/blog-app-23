package com.example.blog_app;

import java.util.List;
import java.util.Optional;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class BlogRepository {
    private final JdbcClient jdbcClient;

    public BlogRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Blog> findAll() {
        return jdbcClient.sql("SELECT name, id, title, mainText, dateTime FROM blogs ORDER by id")
                .query(Blog.class)
                .list();
    }

    public void save(Blog blog) {
        jdbcClient.sql("INSERT INTO blogs (name, id, title, mainText, dateTime) VALUES (:name, :id, :title, :mainText, now())")
                .param("name", blog.getName())
                .param("id", blog.getId())
                .param("title", blog.getTitle())
                .param("mainText", blog.getMainText())
                .param("dateTime", blog.getDateTime())
                .update();
    }

    public Optional<Blog> findById(Long id){
        return jdbcClient.sql("SELECT name, id, title, mainText, dateTime FROM blogs WHERE id = :id")
        .param("id", id)
        .query(Blog.class)
        .optional();

    }
}
