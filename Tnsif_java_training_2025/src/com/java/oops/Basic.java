package com.java.oops;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		double salary = 50000.00;
		boolean isPassed = true;
		char grade = 'A';
		
		System.out.println(isPassed+" "+grade);
		
		
//		type casting
		double newSalary = age;
		int roundSalary = (int)salary;
		
		System.out.println(newSalary);
		
		
		int bonus = 5000;
		int total = roundSalary + bonus;
		
		System.out.println(age);
		System.out.println(salary);
		System.out.println(roundSalary);
		System.out.println(total);
	}

}
