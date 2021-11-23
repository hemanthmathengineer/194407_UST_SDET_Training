package com.ust.test;
interface A1{
	void eat();
		
}
interface A2{
	void run();
	}	

class A3 implements A1,A2
{
	public void eat()
	{
		System.out.println("I am eating");
	}
	public void run() 
	{
		System.out.println("I am running");
	}
}
public class ImplemetsExample2
{
	public static void main(String[] args) {

		A3 obj1=new A3();
		obj1.eat();
		obj1.run();
	}
	}


