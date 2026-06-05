package com.example.blog_app;

public class BlogForm {
    private String name;
    private String title;
    private String mainText;
    
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getTitle(){
        return title;
    }

    public String getMainText(){
        return mainText;
    }
}
