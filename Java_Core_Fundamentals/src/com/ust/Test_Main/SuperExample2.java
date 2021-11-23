package com.ust.test;
class parentclass{
	void display() {
		System.out.println("Parent class method");
	}
}
class subclass extends parentclass{
	void display() {
		System.out.println("Child class method");
	}
	void printMsg() {
		display();
		super.display();
	}
}
public class SuperExample2 {

	public static void main(String[] args) {
		subclass obj=new subclass();
		
		obj.printMsg();

	}

}




