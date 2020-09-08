package com.kplan.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class EmployeeManagementTree {

	
	private static List <Employee> employees;
	 static List<String> tmpArray;
	
	
	static void displayManagementTree(List<Employee> employees) {
		
		 List<Employee> eList =  employees.stream()
				 				.filter(e -> e.getMid()>=0)
				 				.collect(Collectors.toList());
		 int rmid =0; //root Manager ID
		 int i=0;
		 List<String> tmpArray = new ArrayList<String>();
		
		 
		for(Employee employee:eList) {
			if(employee.getMid()==0) {
				System.out.println("->"+employee.getEname());
				rmid = employee.getEid();// Assign root employee id to local varaible to compare this value with Manager ID of other employess
				
				
			} else if(employee.getMid() == rmid) {
				// If previous employee has seen with the same manager add to temporary array to sort before printing
				if (i==0) {
					
					
					tmpArray.add(employee.getEname());
					i++;
				}  else {
				
				System.out.println("->->"+employee.getEname());
				}
			} else {
				
				tmpArray.sort(Comparator.comparing(String::toString));
				for(String eName : tmpArray) {
					System.out.println("->->"+eName);
				}
				 
				if(i>1) i =0; //reset the flag value
				
				System.out.println("->->->"+employee.getEname());
				
			}
		}
							 
   }
	
	public static void main(String[] args) {
		//EmployeeManagementTree emt = new EmployeeManagementTree();
		employees = new ArrayList<Employee>();
		
		employees.add(new Employee(10,"Tom",0));
		employees.add(new Employee(2,"Mickey",10));
		employees.add(new Employee(3,"Jerry",10));
		employees.add(new Employee(7,"John",2));
		employees.add(new Employee(5,"Sarah",10));
		
		displayManagementTree(employees);
		
	}
	
	
}
