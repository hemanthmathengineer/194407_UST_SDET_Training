package com.ust.test;
class Data_{
	private String name;


public String getName() {
	return this.name;
	
}
public void setName(String name) {
	this.name=name;
}
}
public class AccessModPrivateString {

	public static void main(String[] args) {
		Data_ d=new Data_();
		d.setName("abc");
		System.out.println(d.getName());
	}
}
		// TODO Auto-generated method stub

	


