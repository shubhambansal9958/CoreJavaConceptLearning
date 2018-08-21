package com.concept.learning.lambda;

import java.util.Collections;

public class Main {
	public static void main(String[] args) {

		new Employee("Shubham", 22);
		new Employee("Nikhil", 21);
		new Employee("Anshul", 42);
		new Employee("Moulick", 20);

		Collections.sort(Employee.employees,
				(employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

		// Print the detail of each employee
		EmployeeUtility.doer(Employee.employees, (employee) -> System.out.println(employee));

		System.out.println("-----------------------------------");

		// Convert the name of each employee into the UperCase 
		EmployeeUtility.doer(Employee.employees, (employee) -> employee.setName(employee.getName().toUpperCase()));

		// Increment the age of each employee by 1 
		EmployeeUtility.doer(Employee.employees, (employee) -> employee.setAge(employee.getAge() + 1));

		// Print the detail of each employee
		EmployeeUtility.doer(Employee.employees, (employee) -> System.out.println(employee));
	}
}
