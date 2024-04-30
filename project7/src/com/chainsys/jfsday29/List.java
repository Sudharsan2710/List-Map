package com.chainsys.jfsday29;
import java.util.*;

public class List {

	public static void main(String[] args) {
		
	ArrayList<Integer> alist = new ArrayList<Integer>();
	
		for(int i=0 ;i<=10;i++ )
		alist.add(i);
		System.out.println(alist);
		
		
		//to get values 
			
		System.out.println(alist.get(4));
		
		//to set values at index position 4 as 100
		System.out.println(alist.set(4, 100));
		
		//To remove the value at index position 6
		System.out.println(alist.remove(6));
		System.out.println(alist);
		
		System.out.println("After using iterator");
		
		Iterator<Integer> i = alist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		
			//using indexof
			System.out.println(alist.indexOf(100));
			
			Object[] array = alist.toArray();

		      // print the array elements
		      for (Object object : array) {
		         System.out.println(object);
			
		         
		      } 
		     		}
	}
	}
	


