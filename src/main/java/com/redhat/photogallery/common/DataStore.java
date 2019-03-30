package com.redhat.photogallery.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DataStore<T extends DataStoreItem> {

	private Map<String, T> items = new HashMap<>();

	public T insertItem(T item) {
		String id = generateId();
		item.setId(id);
		items.put(id, item);
		return item;
	}

	public void setItem(T item) {
		items.put(item.getId(), item);
	}

	public T getItem(String id) {
		return items.get(id);
	}

	public List<T> getAllItems() {
		return new ArrayList<>(items.values());
	}

	private String generateId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}