package com.java.exceptionhandling;

import java.util.Scanner;

public class ThrowThrowsExample {
	static void checkAge(int age) 
	throws ArithmeticException{
		if(age<18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}
		else {
			System.out.println("Access granted - You are old enough!");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int userAge = scan.nextInt();
		try {
			checkAge(userAge);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught: "+ e.getMessage());
		}
		finally {
			System.out.println("Program completed.");
			scan.close();
		}
	}
}
