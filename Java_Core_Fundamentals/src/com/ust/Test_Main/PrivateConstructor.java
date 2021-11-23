package com.ust.test;

public class PrivateConstructor {
	int a;
	boolean b;
	
	private PrivateConstructor() {
		a=10;
		b=true;
	}

	public static void main(String[] args) {
		PrivateConstructor ob=new PrivateConstructor();
		System.out.println("Deafault value:");
		System.out.println("a="+ob.a);
		System.out.println("b="+ob.b);
		
		

	}

}
