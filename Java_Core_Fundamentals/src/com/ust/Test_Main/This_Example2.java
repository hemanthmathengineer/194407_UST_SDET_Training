package com.ust.test;


class Test_method{
	int var1;
	int var2;
	
	Test_method()
	{
		var1=10;
		var2=20;
	}
	void printVal(Test_method obj) {
		System.out.println("var1=" +obj.var1+"var2="+obj.var2);
		
	}
	void get() {
		printVal(this);
	}
}
class This_Example2 {

	public static void main(String[] args) {
		Test_method object=new Test_method();
		object.get();
	

	}

}
