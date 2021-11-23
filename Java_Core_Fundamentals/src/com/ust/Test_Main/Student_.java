package com.ust.test;

class Student_ {
	
	int rollNo;
	String name;
	static String collegeName;
}
class StaticVar
{
	
	public static void main(String[] args)
	{
		Student_ s1=new Student_();
		Student_ s2=new Student_();
		Student_ s3=new Student_();
		
		Student_.collegeName="Topper";
		
		s1.rollNo=1;
		s1.name="Student 1";
		
		s2.rollNo=2;
		s2.name="Student 2";
		
		s3.rollNo=3;
		s3.name="Student 3";
		
		
		System.out.println("S1 roll no="+s1.rollNo+"S1 Name="+s1.name+"S1 college name="+s1.collegeName);
		System.out.println("S2 roll no="+s2.rollNo+"S2 Name="+s2.name+"S2 college name="+s2.collegeName);
		System.out.println("S3 roll no="+s3.rollNo+"S3 Name="+s3.name+"S3 college name="+s3.collegeName);
		
		s2.collegeName="My college";
		s2.name="Ram";
		
		
		System.out.println("S1 roll no"+s1.rollNo+"S1 Name="+s1.name+"S1 college name="+s1.collegeName);
		System.out.println("S2 roll no"+s2.rollNo+"S2 Name="+s2.name+"S2 college name="+s2.collegeName);
		System.out.println("S3 roll no"+s3.rollNo+"S3 Name="+s3.name+"S3 college name="+s3.collegeName);		

	}

}
