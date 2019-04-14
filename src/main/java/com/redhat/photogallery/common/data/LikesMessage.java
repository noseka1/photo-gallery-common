package com.redhat.photogallery.common.data;

public class LikesMessage {

    private Long id;
    private int likes;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "LikesItem [id=" + id + ", likes=" + likes + "]";
    }

}
