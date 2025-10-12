package com.java.interfacedemo;


interface Shape{
	void draw();
}
public class InterfaceExample implements Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle in an interface");
	}
	
	public static void main(String[] args) {
		InterfaceExample ie = new InterfaceExample();
		ie.draw();
	}
}

