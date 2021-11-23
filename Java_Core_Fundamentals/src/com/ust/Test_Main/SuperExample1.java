package com.ust.test;

class animal{
	animal(){
		System.out.println("Animal is there");
	}
}

class dog_ extends animal{
	dog_(){
	super();
	System.out.println("dog is alive");
}
}
public class SuperExample1 {

	public static void main(String[] args) {
		dog_ d=new dog_();
		// TODO Auto-generated method stub

	}

}
