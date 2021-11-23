package com.ust.test;
abstract class AnonymousInner{
	public abstract void myMethod();
	
}

public class InOutClassExample3 {

	public static void main(String[] args) {
		AnonymousInner i=new AnonymousInner() {
			public void myMethod() {
				System.out.println("This is an example of anonymous class");
				
			}
		
		};
		i.myMethod();
		
		// TODO Auto-generated method stub

	}

}
