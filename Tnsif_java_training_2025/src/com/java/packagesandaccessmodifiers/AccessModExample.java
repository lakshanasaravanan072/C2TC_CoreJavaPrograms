package com.java.packagesandaccessmodifiers;

public class AccessModExample {
	
	public int publicvar = 100;
	private int privatevar = 2000;
	protected int protvar = 30000;
	int defaultvar = 400000;
	
	public void runningg(){
		System.out.println("The Public variable is "+ publicvar);
		System.out.println("The Private variable is "+ privatevar);
		System.out.println("The Protected variable is "+ protvar);
		System.out.println("The default variable is "+ defaultvar);
	}
	
	
	public static void main(String[] args) {
		
		AccessModExample ame = new AccessModExample();
		ame.runningg();
	}
}
