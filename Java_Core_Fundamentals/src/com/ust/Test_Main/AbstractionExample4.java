package com.ust.test;
abstract class Base_{
	abstract void func();
}

class Derived123 extends Base_{
	void func() {
		System.out.println("Derived class is called");
	}
	
}
public class AbstractionExample4 {

	public static void main(String[] args) {
		Base_ b = new Derived123();
		b.func();
	}
}
