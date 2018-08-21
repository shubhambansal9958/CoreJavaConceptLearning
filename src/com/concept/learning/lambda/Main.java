package com.concept.learning.lambda;

import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		new Employee("Shubham", 22);
		new Employee("Nikhil", 21);
		new Employee("Anshul", 42);
		new Employee("Moulick", 20);

		Collections.sort(Employee.employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

		Employee.employees.forEach(e -> System.out.println(e));
		
		
		System.out.println("-----------------------------------");
		
		
		EmployeeUtility.doer(Employee.employees,
				(employee) -> employee.setName(employee.getName().toUpperCase())
//				Below Code shows the functionality behind Upper Statement
//				new Performer<Employee>() {
//					@Override
//					public void perform(Employee employee) {
//						employee.setName(employee.getName().toUpperCase());
//					}
//			
//				}
				
		);
		
		EmployeeUtility.doer(Employee.employees, 
				(employee) -> employee.setAge(employee.getAge()+1)
				);
		
		Employee.employees.forEach(e -> System.out.println(e));
		
	}
}
