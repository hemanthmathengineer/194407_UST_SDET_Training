package com.ust.Test_Main;

public class MethodOverRidingExample4
{
	public void disp() 
	{
		System.out.println("dis() method of parent class");
	}
}
class Demo1 extends MethodOverRidingExample4 {
	public void disp()
	{
			System.out.println("dis() method of child class");
	}	
	public void newMethod() 
	{		
		System.out.println("New method of child class");
	}
	public static void main(String[] args) 
	{
		MethodOverRidingExample4  obj=new MethodOverRidingExample4 ();
		obj.disp();		
		Demo1 obj1=new Demo1();
		obj1.disp();
	}
}


