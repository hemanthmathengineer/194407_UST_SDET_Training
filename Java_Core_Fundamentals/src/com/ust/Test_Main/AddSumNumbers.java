package com.ust.test;
import java.util.Scanner;
public class AddSumNumbers {

	public static void main(String[] args) {
		int sum=0;
		Scanner i=new Scanner(System.in);
		//Taking input
		System.out.println("Enter number out");
		int number=i.nextInt();		
		
		while(number>=0) {
			
			System.out.println("Enter number");
			number=i.nextInt();
			sum=sum+number;
			
			
		}
		
	System.out.println("sum =" + sum);
	i.close();
	}
}
