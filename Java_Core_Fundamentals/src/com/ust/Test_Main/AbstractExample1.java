package com.ust.test;

public abstract class AbstractExample1 {
	
	private String name;
	private int paymentPerHour;
	
	public AbstractExample1(String name,int paymentPerHour) {
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
public abstract int caluculateSalary();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}

public int getPaymentPerHour() {
	return paymentPerHour;
}
public void setPaymentPerHour(int paymentPerHour) {
	this.paymentPerHour=paymentPerHour;
}
}
