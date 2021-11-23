package com.ust.test;

import java.util.ArrayList;

public class CollectionsExample1 {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();//We created new arraylist and restricted it to string data types
		cars.add("Volvo");
		cars.add("olo");
		cars.add("benz");
		cars.add("rolls");
		cars.add("TATA");
		
		//We are using enhanced for loop to fetch and print all the 
		for(String i:cars) {
			System.out.println(i);
		}
		
		
		
		
		// This is a collection where are using ArrayList method by restricting it into string type

	}

}
