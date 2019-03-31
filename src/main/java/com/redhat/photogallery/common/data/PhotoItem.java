package com.redhat.photogallery.common.data;

public class PhotoItem extends DataStoreItem {

	private String name;
	private String category;

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
