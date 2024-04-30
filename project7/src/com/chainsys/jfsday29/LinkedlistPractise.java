package com.chainsys.jfsday29;
import java.util.*;
import java.util.List;
public class LinkedlistPractise {

	public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        arrayList.add("vishnu");
        arrayList.add( "kumar");
        arrayList.add( "vimal");
        System.out.println(arrayList);
          newList =(ArrayList) arrayList.clone();
         System.out.println(newList);
         newList.remove("vimal");
         System.out.println(newList);
         System.out.println("class of newList : "+newList.getClass());
         System.out.println();
         Collections.sort(arrayList);
         System.out.println(arrayList);
         System.out.println("index of Element : "+arrayList.indexOf("kumar"));
         
         //linked list
         
    LinkedList<String> names = new LinkedList<>();
         List<String> list = new LinkedList<>();
        names.addAll(arrayList);
        System.out.println(names);
        System.out.println(names.equals(arrayList));
        names.add("kumar");
        
        System.out.println(names.lastIndexOf("kumar"));
        
         list = names.subList(0, 2);
         System.out.println(list);
        
    
         Set<String> data = new LinkedHashSet<String>();   
         Set<String> data1 = new LinkedHashSet<String>();   
            data.add("let");   
            data.add("it");   
            data.add("go");   
            data.add("go");   //duplicates are not allowed
        
            System.out.println(data);  
            data1.add("make");
            data1.add("your");
            data1.add("way");
            data.addAll(data1);
            System.out.println(data);
            System.out.println(data.containsAll(data1));
            
            Queue<String> fruits = new LinkedList<>();
            fruits.add("apple");
            fruits.add("orange");
            fruits.add("mango");
            System.out.println(fruits.poll());
            fruits.peek();
            System.out.println(fruits);
            
            System.out.println(fruits);
           Iterator value =fruits.iterator();
           while(value.hasNext()){
              System.out.println(value.next()); 
           }
           Queue<String> animals =new PriorityQueue<>();
           animals.add("Lion");
           animals.add("tiger");
           animals.add("elephant");
           System.out.println(animals);
           System.out.println(animals.size());
           animals.poll();
           System.out.println(animals);
           animals.clear();
           System.out.println("is animals queues empty : "+animals.isEmpty());
    }
}

