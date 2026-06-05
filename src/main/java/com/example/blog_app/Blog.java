package com.example.blog_app;

import java.time.LocalDateTime;

public class Blog {
    private String name;
    private Long id;
    private String title;
    private String mainText;
    private LocalDateTime dateTime;

    public Blog(String name, Long id, String title, String mainText, LocalDateTime dateTime){
        this.name = name;
        this.id = id;
        this.title = title;
        this.mainText = mainText;
        this.dateTime = dateTime;
    }

    public String getName(){
        return name;
    }

    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getMainText(){
        return mainText;
    }

    public LocalDateTime getDateTime(){
        return dateTime;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
