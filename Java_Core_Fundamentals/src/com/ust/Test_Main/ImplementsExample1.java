package com.ust.test;
interface Polygon {
	void getArea(int length, int breadth);
}
class Rectangle1 implements Polygon{
	public void getArea(int length, int breadth) {
		System.out.println("The area of the rectangle is" + (length*breadth));
	}
}
public class ImplementsExample1 {

	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1();
		r.getArea(5, 6);
		// TODO Auto-generated method stub

	}

}
