package com.redhat.photogallery.common.data;

public class PhotoCreatedMessage {

    private Long id;
    private String name;
    private String category;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "PhotoItem [id=" + id + ", name=" + name + ", category=" + category + "]";
    }

}
