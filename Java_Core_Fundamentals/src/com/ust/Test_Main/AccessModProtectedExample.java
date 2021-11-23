package com.ust.test;



public class AccessModProtectedExample {

		protected void display() {
			System.out.println("I am an animal");
			
		}
	}
	class Dog extends AccessModProtectedExample{


	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.display();
		
	}

}
