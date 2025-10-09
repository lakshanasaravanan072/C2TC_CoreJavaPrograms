package com.java.oops;

public class EncapsulationDemo {
	
	//IPL Team
	
		//CSK
		
		//data members or variables
	//getters and setters

	String name;
	int age;
	int jersyNo;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;//this refers to the current object
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getJersyNo() {
		return jersyNo;
	}
	
	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}
	
	@Override
	public String toString() {
		return "EncapsulationDemo[name=" +name + ", age= " +age+",jersyNo=" + jersyNo +"]";
		
	}
	
	
}
