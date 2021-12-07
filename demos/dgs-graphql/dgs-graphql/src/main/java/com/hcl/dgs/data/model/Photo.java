package com.hcl.dgs.data.model;

public class Photo implements SearchResult {
    private Integer height;

    private Integer width;
    private Long pixel;

    public Photo() {
    }

    public Photo(Integer height, Integer width, Long pixel) {
        this.height = height;
        this.width = width;
        this.pixel = pixel;
    }

    public Long getPixel() {
        return pixel;
    }

    public void setPixel(Long pixel) {
        this.pixel = pixel;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }


}