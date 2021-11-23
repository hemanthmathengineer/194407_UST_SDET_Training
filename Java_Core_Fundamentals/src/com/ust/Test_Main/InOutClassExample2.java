package com.ust.test;

public class InOutClassExample2 {
	void myMethod() {
		int num=23;
		
		class MethodInnerDemo{
			public void print() {
				System.out.println("This is method inner class " + num);
			}
		}
		MethodInnerDemo i=new MethodInnerDemo();
		i.print();
	}

	public static void main(String[] args) {
		InOutClassExample2 o=new InOutClassExample2();
		o.myMethod();
		// TODO Auto-generated method stub

	}

}
