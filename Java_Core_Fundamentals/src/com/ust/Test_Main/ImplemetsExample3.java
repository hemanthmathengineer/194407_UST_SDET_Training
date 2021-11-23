package com.ust.test;
interface I1
{
	final int a = 10;
	default void display() {
		System.out.println("Hello");
	}
}

public class ImplemetsExample3 implements I1 {

	public static void main(String[] args) {
		ImplemetsExample3 t=new ImplemetsExample3();
		t.display();
		

	}

}
