package com.ust.test;
import java.util.HashSet;
public class CollectionsHashSetExample4 {

	public static void main(String[] args) {
		
		HashSet<Integer>numbers=new HashSet<Integer>();
		
		numbers.add(4);
		numbers.add(44);
		numbers.add(444);
		
		
		for(int i:numbers) {
			if(numbers.contains(i)) {
				System.out.println(i + " Was found in the set");
			}else {
				System.out.println(i+" was not found in the set");
			}
		}
		// TODO Auto-generated method stub

	}

}
