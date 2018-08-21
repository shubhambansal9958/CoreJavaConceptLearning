package com.concept.learning.collection;

import java.util.Comparator;

public class Item implements Comparable<Item> {
	private int id;
	private String name;
	private int price;

	public Item() {
	}

	public Item(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return id + " : " + name + " : " + price;
	}

	@Override
	public boolean equals(Object obj) {
		Item item = (Item) obj;
		if (id == item.getId() && name.equals(item.getName()) && price == item.getPrice())
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return id % 10;
	}

	@Override
	public int compareTo(Item o) {

		int result = id - o.getId();
		if (result == 0)
			result = name.compareTo(o.getName());
		if (result == 0)
			result = price - o.getPrice();
		return result;
	}

	public static Comparator<Item> IdComparator = new Comparator<Item>() {

		@Override
		public int compare(Item o1, Item o2) {
			return o1.getId() - o2.getId();
		}

	};
	public static Comparator<Item> NameComparator = new Comparator<Item>() {

		@Override
		public int compare(Item o1, Item o2) {
			return o1.getName().compareTo(o2.getName());
		}

	};
	public static Comparator<Item> PriceComparator = new Comparator<Item>() {

		@Override
		public int compare(Item o1, Item o2) {
			return o1.getPrice() - o2.getPrice();
		}

	};

}
