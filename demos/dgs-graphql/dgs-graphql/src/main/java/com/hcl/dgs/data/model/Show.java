package com.hcl.dgs.data.model;


public class Show implements  Video {
    private String title;
    private Integer seasons;

    public Show(String title, Integer seasons) {
        this.title = title;
        this.seasons = seasons;
    }

    public String getTitle() {
        return title;
    }

    public Integer getSeasons() {
        return seasons;
    }
}