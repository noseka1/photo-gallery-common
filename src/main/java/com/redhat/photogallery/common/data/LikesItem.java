package com.redhat.photogallery.common.data;

public class LikesItem extends DataStoreItem {

	private int likes;

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
