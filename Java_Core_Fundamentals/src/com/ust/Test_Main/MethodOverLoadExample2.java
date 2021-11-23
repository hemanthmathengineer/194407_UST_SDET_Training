package com.ust.test;

public class MethodOverLoadExample2 {
	double sum(int x, double y) {
		return x+y;
	}
	
	double sum(double x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		MethodOverLoadExample2 obj=new MethodOverLoadExample2();
		System.out.println(obj.sum(20, 30.1));
		System.out.println(obj.sum(20.3, 30));

	}

}
