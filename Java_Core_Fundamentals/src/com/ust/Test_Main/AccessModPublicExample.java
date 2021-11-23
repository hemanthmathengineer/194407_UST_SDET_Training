package com.ust.test;

class Animal123{
	public int legCount;
	
	public void display() {
		System.out.println("I am an animal");
		System.out.println("I have "+ legCount +" legs.");
	}
	}
public class AccessModPublicExample {

	public static void main(String[] args) {
		Animal123 a=new Animal123();
		a.legCount=5;
		a.display();
		

	}

}
