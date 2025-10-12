package com.java.exceptionhandling;

public class WithoutExceptionHandling {
	public static void main(String[] args) {
		System.out.println("The Program Continues....");
		int data = 100/0;
		System.out.println("The data passed is: "+data);
	}
}
