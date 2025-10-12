package com.java.nonaccessmod;

public class StaticDemo {
	
	static int count;
	
	static {
		count = 20;
		System.out.println("The count value inside the static block: "+count);
	}
	
	static void display() {
		System.out.println("The count value static method: "+ count);
	}
	
	public static void main(String[] args) {
		System.out.println("The count value in main: "+count);
		display();
	}
}
