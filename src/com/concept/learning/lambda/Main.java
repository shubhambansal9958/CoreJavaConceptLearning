package com.concept.learning.lambda;

import java.util.Collections;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {

		new Employee("Shubham", 22);
		new Employee("Nikhil", 21);
		new Employee("Anshul", 42);
		new Employee("Moulick", 19);

		Collections.sort(Employee.employees,
				(employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

		// Print the detail of each employee
		EmployeeUtility.doer(Employee.employees, (employee) -> System.out.println(employee));

		// Convert the name of each employee into the UperCase
		EmployeeUtility.doer(Employee.employees, (employee) -> employee.setName(employee.getName().toUpperCase()));

		// Increment the age of each employee by 1
		EmployeeUtility.doer(Employee.employees, (employee) -> employee.setAge(employee.getAge() + 1));

		// Print the detail of each employee
		System.out.println("-----------------------------------");
		EmployeeUtility.doer(Employee.employees, (employee) -> System.out.println(employee));

		// Print the details of all employee whose are younger than 30
		System.out.println("-----------------------------------");
		System.out.println("<--(Employees < 30)-->");
		EmployeeUtility.doer(Employee.employees, (employee) -> {
			if (employee.getAge() < 30)
				System.out.println(employee);
		});

		// Print the details of all employee whose are younger than 30 using Predicates
		System.out.println("-----------------------------------");
		System.out.println("<--(Employees < 30) using predicate-->");
		Predicate<Employee> ageCondition1 = (employee) -> employee.getAge() < 30;
		EmployeeUtility.doer(Employee.employees, (employee) -> {
			if (ageCondition1.test(employee))
				System.out.println(employee);
		});

		// Print the details of all employee whose ages are from 20 to 30 using Predicates
		System.out.println("-----------------------------------");
		System.out.println("<--(20 < Employees < 30) using predicate-->");
		Predicate<Employee> ageCondition2 = (employee) -> employee.getAge() > 20;
		EmployeeUtility.doer(Employee.employees, (employee) -> {
			if (ageCondition1.and(ageCondition2).test(employee))
				System.out.println(employee);
		});

	}
}
