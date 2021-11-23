package com.ust.test;
class OuterDemo{
	int num;
	private class InnerDemo{
		public void print() {
			System.out.println("This is an inner class");
		}
	}
	void displayInner() {
		InnerDemo i=new InnerDemo();
		i.print();
		
	}
}
public class InOutClassExample1 {

	public static void main(String[] args) {
		OuterDemo o=new OuterDemo();
		o.displayInner();
		// TODO Auto-generated method stub

	}

}
