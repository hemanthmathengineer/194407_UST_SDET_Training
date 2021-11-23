package com.ust.test;

public class MethodOverLoadExample1 {
	int sum(int x,int y) {
		return x+y;
	}
	int sum(int x, int y, int z) {
		return x+y+z;
		
	}

	public static void main(String[] args) {
		MethodOverLoadExample1 obj=new MethodOverLoadExample1();
		System.out.println(obj.sum(20, 30));
		System.out.println(obj.sum(20, 30, 40));
		

	}

}
