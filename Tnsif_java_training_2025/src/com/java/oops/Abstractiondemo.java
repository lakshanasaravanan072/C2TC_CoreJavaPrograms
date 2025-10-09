package com.java.oops;


abstract class Shape{
	abstract void draw();
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
}

public class Abstractiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = new Circle();
		s.draw();

	}

}
