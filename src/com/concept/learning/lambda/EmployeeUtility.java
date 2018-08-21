package com.concept.learning.lambda;

import java.util.List;

public class EmployeeUtility {
	public static <T> void doer(List<T> list, Performer<T> perfomer) {
		for (T t : list) {
			perfomer.perform(t);
		}
	}
}

@FunctionalInterface
interface Performer<T> {
	public void perform(T obj);
}
