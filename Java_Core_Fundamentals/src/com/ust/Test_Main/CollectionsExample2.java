package com.ust.test;

import java.util.ArrayList;

public class CollectionsExample2 {

	public static void main(String[] args) {
		//
		ArrayList<Integer> cars = new ArrayList<Integer>();//We created new arraylist and restricted it to string data types
		cars.add(10);
		cars.add(101);
		cars.add(101);
		cars.add(110);
		cars.add(110);
		
		//We are using enhanced for loop to fetch and print all the 
		for(Integer i:cars) {
			System.out.println(i);
		}
		
		

	}

}
