package com.java.nonaccessmod;

final class FinalDemo {
	
	final int max = 100;
	
	final void display() {
		System.out.println("Show the value of max: " +max);
	}
	
	public static void main(String[]args) {
		FinalDemo fd = new FinalDemo();
		fd.display();
		}
	}

//class Child extends FinalDemo{
//	
//	public void display() {
//		System.out.println("Show second the value of Max: "+max);
//	}
//}
//}