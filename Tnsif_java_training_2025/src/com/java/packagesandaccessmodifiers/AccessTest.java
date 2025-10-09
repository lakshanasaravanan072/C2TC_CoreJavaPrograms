package com.java.packagesandaccessmodifiers;


public class AccessTest {

	
	private void test1() {
		// TODO Auto-generated method stub
		AccessModExample ame = new AccessModExample();
		System.out.println("The public var is used here "+ ame.publicvar);

	}
	public static void main(String[] args) {
//		AccessModExample at = new AccessModExample();
//		System.out.println("The public variable is accessed here "+at.publicvar);
		
		AccessTest at = new AccessTest();
		at.test1();
	}
}
