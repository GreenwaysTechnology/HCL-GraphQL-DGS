package com.hcl.dgs.data.model;

public class Movie implements Video {
    private String title;
    private String length;

    public Movie(String title, String length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
