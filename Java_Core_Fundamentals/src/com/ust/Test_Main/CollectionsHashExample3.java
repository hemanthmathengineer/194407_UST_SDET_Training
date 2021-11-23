package com.ust.test;
import java.util.HashMap;
public class CollectionsHashExample3 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> people=new HashMap<String, Integer>();
		people.put("John", 32);
		people.put("Peter", 52);
		people.put("rocky", 39);
		
		for(String i:people.keySet()) {
			System.out.println("Key: "+ i +" Value:" + people.get(i));
		}
		
		// We use Hashmap and we are fetching and priting values from it

	}

}
