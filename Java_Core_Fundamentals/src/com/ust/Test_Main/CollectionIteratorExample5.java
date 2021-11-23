package com.ust.test;
import java.util.ArrayList;
import java.util.Iterator;
public class CollectionIteratorExample5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(120);
		numbers.add(130);
		numbers.add(103);
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			Integer i =it.next();
			if(i<10) {
				it.remove();
				
			}
		}
		System.out.println(numbers);
		

	}

}
