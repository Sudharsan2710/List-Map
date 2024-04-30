package com.chainsys.jfsday29;
import java.util.*;
public class Listpractise {
	public static void main(String[] args) {

		      // create an empty arrayList
		      ArrayList<Student> arrayList = new ArrayList<>();

		      // use add() method to add elements in the arrayList
		      arrayList.add(new Student(1, "Julie"));
		      arrayList.add(new Student(2, "Robert"));
		      arrayList.add(new Student(3, "Adam"));
			  
		      // get the array of Student objects
		      Student[] array = arrayList.toArray(new Student[arrayList.size()]);

		      // print the array elements
		      for (Student student : array) {
		         System.out.println(student);
		      }  
		   }
		}

		class Student {
		   int rollNo;
		   String name;

		   Student(int rollNo, String name){
		      this.rollNo = rollNo;
		      this.name = name;
		   }

		   @Override
		   public String toString() {
		      return "[ " + this.rollNo + ", " + this.name + " ]";
		   }
		   
		   @Override
		   public boolean equals(Object obj) {
		      Student s = (Student)obj;
		      return this.rollNo == s.rollNo && this.name.equalsIgnoreCase(s.name);
		   }
		}