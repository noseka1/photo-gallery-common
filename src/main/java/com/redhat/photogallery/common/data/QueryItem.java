package com.redhat.photogallery.common.data;

public class QueryItem extends DataStoreItem {

	private String name;
	private String category;
	private int likes;

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

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "QueryItem [name=" + name + ", category=" + category + ", likes=" + likes + ", id=" + id + "]";
	}

}
