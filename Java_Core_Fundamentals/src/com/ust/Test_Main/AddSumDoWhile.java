package com.ust.test;
import java.util.Scanner;
public class AddSumDoWhile {

	public static void main(String[] args) {
		int sum=0;
		int number=0;
		
		Scanner input=new Scanner(System.in);
		
		do {
			
			System.out.println("Enter a number");
			number=input.nextInt();
			sum=sum+number;
		}while(number>=0);
		System.out.println("sum ="+sum);
		input.close();
	}

}
