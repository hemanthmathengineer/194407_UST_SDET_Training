package com.ust.test;

public class ArrayAverage {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,5,9,8,7,8};
		
		int sum=0;
		double average;
		
		for(int number: numbers) {
			sum=sum+number;
			
		}
		
		int arrayLength=numbers.length;
		
		average=((double)sum/(double)arrayLength);
		
		System.out.println("sum =" +" "+ sum);
		System.out.println("Average =" +" "+ average);
		
		

	}

}
