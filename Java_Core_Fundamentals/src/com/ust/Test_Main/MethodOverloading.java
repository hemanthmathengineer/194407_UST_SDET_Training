package com.ust.test;

public class MethodOverloading {
	void method1(int a,int b){
		System.out.println(a);
		System.out.println(b);
	
	}
	
	void method1(float x,float y) {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		MethodOverloading ob=new MethodOverloading();
		ob.method1(5,6);
		ob.method1(2.2f,2.1f);
		
		
	
		}
		

	}

