package com.ust.test;

public class ConstructorOverloadingExamples {
	String language;
	
	ConstructorOverloadingExamples(){
		this.language="java";
		
	}
		ConstructorOverloadingExamples(String language){
		this.language=language;
	}
	public void getName() {
		System.out.println("programming language:" + this.language);
	}

	public static void main(String[] args) {
		
		ConstructorOverloadingExamples obj1=new ConstructorOverloadingExamples();
		ConstructorOverloadingExamples obj2=new ConstructorOverloadingExamples("Python");
		
		obj1.getName();
		obj2.getName();
		

	}

}
