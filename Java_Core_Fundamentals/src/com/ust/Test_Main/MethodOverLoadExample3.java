package com.ust.test;

public class MethodOverLoadExample3 {
	long sum(int x, long y) {
		return x+y;
	}
	
	int sum(int x, int y, int z) {
		return x+y+z;
	}

	public static void main(String[] args) {
		MethodOverLoadExample3 obj=new MethodOverLoadExample3();
		System.out.println(obj.sum(20, 30));
		System.out.println(obj.sum(20, 30, 20));

	}

}
