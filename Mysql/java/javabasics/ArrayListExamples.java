package javabasics;

import java.util.*;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> ar = new ArrayList();
		LinkedList<String> ar = new LinkedList();
		ar.add("India");
		ar.add("China");
		ar.add("Japan");
		ar.add("Nepal");
		ar.add("Nepal");
		System.out.println(ar);
		ArrayList<String> ar1 = new ArrayList();
		ar1.add("America");
		ar1.add("Aus");
		ar1.add(null);
		ar1.add(null);
		ar.addAll(ar1);
		System.out.println(ar);
		ar.remove("China");
		System.out.println(ar);
		if(ar.contains("China"))
			System.out.println("India found in the list");
		else
			System.out.println("Not found in the list...");
			System.out.println(ar.size());
			//Iterator method to traverse the elements from list.
			Iterator itr = ar.iterator();
			//hasNext(), next()
			System.out.println("Traversing using iterator");
			while(itr.hasNext())
				System.out.println(itr.next());
			//using enhansed for loop	
			System.out.println("Traversing using for loop");
			for(String s: ar) {​
				System.out.println(s);
			}​
			//forEach method...
			System.out.println("Traversing using forEach method...");
			ar.forEach(System.out::println);


}​
}​
