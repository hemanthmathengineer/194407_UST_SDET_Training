package com.ust.test;

public class JavaExampleStatic {
	static int age;
	static String name;
	
	static void disp() {
		System.out.println("Age is :"+age);
		System.out.println("Name is :"+name);
	}

	public static void main(String[] args) {
		age = 30;
		name = "shiv";
		
	disp();

	}

}
