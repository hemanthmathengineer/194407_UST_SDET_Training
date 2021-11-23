package com.ust.test;

public class MethodOverRidingExample2 {
	void teach() {
		System.out.println("Teaching subjets");
	}
	}
	class Students extends MethodOverRidingExample2{
	void listen() {
		System.out.println("listening");
	}
}
class CheckForInheritance{

	public static void main(String[] args) {
		Students s1= new Students();
		s1.teach();
		s1.listen();

	}

}
