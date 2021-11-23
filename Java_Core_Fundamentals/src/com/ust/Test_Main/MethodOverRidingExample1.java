
package com.ust.test;

public class MethodOverRidingExample1 {
	public void eat()
	{
		System.out.println("He is eating");
		
	}
}
	
	class Boy extends MethodOverRidingExample1{
		public void eat() 
		{
			System.out.println("Boy alreay ate");
		}
		//Method overiding is done in inheritance

	public static void main(String[] args) {
		Boy b1=new Boy();
		b1.eat();
	}
}
