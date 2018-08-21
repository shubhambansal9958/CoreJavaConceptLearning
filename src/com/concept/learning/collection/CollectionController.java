package com.concept.learning.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class CollectionController {

	public static void main(String[] args) {

		System.out.println("------------------ArrayList-------------------");
		ArrayList<Item> arrayList = new ArrayList<>();

		arrayList.add(new Item(101, "Mobile", 15000));
		arrayList.add(new Item(101, "Computer", 15000));
		arrayList.add(new Item(101, "Mobile", 15000));
		arrayList.add(new Item(101, "Mobile", 6000));
		arrayList.add(new Item(111, "Tablet", 10000));
		arrayList.add(new Item(104, "Charger", 500));
		arrayList.add(new Item(104, "Charger", 500));
		arrayList.add(new Item(105, "Printer", 5200));
		arrayList.add(new Item(106, "Monitor", 3400));
		arrayList.add(new Item(108, "Handfree", 1000));
		arrayList.add(new Item(103, "Laptop", 45000));
		arrayList.add(new Item(109, "Laptop", 31000));
		arrayList.add(new Item(107, "ScreenGuard", 100));

		System.out.println("Size : " + arrayList.size() + "\n");

		for (Item item : arrayList) {
			System.out.println(item);
		}

		Item item1 = new Item();
		item1.setId(101);
		item1.setName("Mobile");
		item1.setPrice(15000);

		String result = (arrayList.contains(item1)) ? "Yes" : "No";
		System.out.println("\nIs [" + item1 + "] contained by ArrayList? : " + result);

		System.out.println("\n------------------LinkedList-------------------");
		LinkedList<Item> linkedList = new LinkedList<>(arrayList);
		System.out.println("\nLinkedList is preparing using ArrayList.........");
		System.out.println("Success");

		Item item2 = new Item(105, "Printer", 5200);
		linkedList.remove(item2);

		System.out.println("\nRemoving [" + item2 + "] from LinkedList..........");
		System.out.println("[" + item2 + "] is removed From the LinkedList");

		Iterator<Item> linkedListIterator = linkedList.iterator();
		while (linkedListIterator.hasNext()) {
			Item elements = linkedListIterator.next();
			System.out.println(elements);
		}

		System.out.println("\n------------------HashSet-------------------");
		HashSet<Item> hashSet = new HashSet<>(arrayList);
		System.out.println("\nHashSet is preparing using ArrayList.........");
		System.out.println("Success");
		System.out.println("\nSize of ArrayList : " + arrayList.size());
		System.out.println("Size of HashSet : " + hashSet.size());
		System.out.println(
				(arrayList.size() - hashSet.size()) + " Duplicate records found, which is removed by HashSet\n");

		for (Item item : hashSet) {
			System.out.println(item);
		}

		System.out.println("\n------------------TreeSet-------------------");
		TreeSet<Item> treeSet = new TreeSet<>(arrayList);
		System.out.println("\nTreeSet is preparing using ArrayList.........");
		System.out.println("Success");
		System.out.println("\nSorted Data is Maintaining By TreeSet : ");
		for (Item item : treeSet) {
			System.out.println(item);
		}

		System.out.println("\n------------------Sorting using Comparators-------------------");
		Item[] itemArr = new Item[arrayList.size()];
		itemArr = arrayList.toArray(itemArr);
		System.out.println("\nArray is Created using ArrayList..........");
		System.out.println("Success");

		System.out.println("\nUnsorted Array : ");
		for (Item item : itemArr) {
			System.out.println(item);
		}

		Arrays.sort(itemArr, Item.IdComparator);
		System.out.println("\nSorted Array(Based On IDs) : ");
		for (Item item : itemArr) {
			System.out.println(item);
		}
		
		Arrays.sort(itemArr, Item.NameComparator);
		System.out.println("\nSorted Array(Based On Names) : ");
		for (Item item : itemArr) {
			System.out.println(item);
		}
		
		Arrays.sort(itemArr, Item.PriceComparator);
		System.out.println("\nSorted Array(Based On Prices) : ");
		for (Item item : itemArr) {
			System.out.println(item);
		}
		
		System.out.println("\n------------------HashMap-------------------");
		HashMap<Integer, Item> hashMap = new HashMap<>();
		System.out.println("\nHashMap is preparing using ArrayList.........");
		System.out.println("Success");
		for (Item item : arrayList) {
			hashMap.put(item.getId(), item);
		}
		System.out.println("\nSize of ArrayList : " + arrayList.size());
		System.out.println("Size of HashMap : " + hashMap.size());
		System.out.println(
				(arrayList.size() - hashMap.size()) +
				" Duplicate records found, which is removed by HashMap\n");

		Set<Integer> keySet = hashMap.keySet();
		for (Integer key : keySet) {
			Item item = hashMap.get(key);
			System.out.println("key ->["+key+"], Value ->["+item+"]");
		}
		
		System.out.println("\n------------------LinkedHashMap-------------------");
		LinkedHashMap<Integer, Item> linkedHashMap = new LinkedHashMap<>(hashMap);
		System.out.println("\nLinkedHashMap is preparing using HashMap.........");
		System.out.println("Success");
		
		Set<Integer> keySet2 = linkedHashMap.keySet();
		for (Integer key : keySet2) {
			Item item = linkedHashMap.get(key);
			System.out.println("key ->["+key+"] ,Value ->["+item+"]");
		}
	}

}
