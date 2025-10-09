package com.java.packagedemo;

import com.java.packagesandaccessmodifiers.AccessModExample;

public class AccessDemo {
	private void test2() {
		// TODO Auto-generated method stub
		
		AccessModExample ame = new AccessModExample();
		System.out.println("The public variable from another package:"+ ame.publicvar);
//		System.out.println("The private variable from another package:"+ ame.privatevar);
//		System.out.println("The protected variable from another package:"+ ame.protvar);
//		System.out.println("The default variable from another package:"+ ame.defaultvar);

	}
	
	public static void main(String[] args) {
		
		AccessDemo ad = new AccessDemo();
		ad.test2();
	}
	
}
