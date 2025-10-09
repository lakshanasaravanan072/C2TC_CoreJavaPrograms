package com.java.oops;

public class Executor {

	public static void main(String[] args) {
		EncapsulationDemo ed= new EncapsulationDemo();
		ed.setName("MS Dhoni");
		ed.setJersyNo(7);
		ed.setAge(43);
		
		System.out.println(ed);
		
		Executor e = new Executor();
		System.out.println(e);
	}
}
