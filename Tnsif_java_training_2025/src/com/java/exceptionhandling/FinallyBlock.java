package com.java.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the number:");
			int number = scan.nextInt();
			System.out.println(number % 2 == 0 ? number + " is even": number + " is odd");
			return;
		}
		catch(InputMismatchException e) {
			System.err.println("Invalid Input");
		}
		finally {
			System.out.println("In Finallyy.....");
			scan.close();
		}
	}
}
