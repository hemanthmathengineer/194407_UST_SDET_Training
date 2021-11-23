package com.ust.test;

public class InOutClassExample4 {
	static class NestedDemo{
		public void myMethod() {
			System.out.println("This is my nested class");
		}
	}

	public static void main(String[] args) {
		InOutClassExample4.NestedDemo n= new InOutClassExample4.NestedDemo();
		n.myMethod();
		
		// TODO Auto-generated method stub

	}

}
