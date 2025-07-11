package com.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicatefromArraylist {

	public static void main(String[] args) {
		// Remove dplicate numbers from Arraylist using LinkedHashSet
		ArrayList<Integer>arr1=new ArrayList<Integer>(Arrays.asList(1,2,2,1,3,4,3,2,5,4,5,4,6,7,5,7,6,8,9,8,9));
		System.out.println("Arraylist with duplicate numbers"+arr1);
		LinkedHashSet<Integer>linkedhash=new LinkedHashSet<Integer>(arr1);
		ArrayList<Integer>arr2=new ArrayList<Integer>(linkedhash);
		System.out.println("Arraylist without duplicate numbers"+arr2);
		//compare two arraylists
		//1.sort and equal
		ArrayList<String>l1=new ArrayList<String>(Arrays.asList("A","C","D","B","E"));
		ArrayList<String>l2=new ArrayList<String>(Arrays.asList("B","D","C","F","E"));
		ArrayList<String>l3=new ArrayList<String>(Arrays.asList("B","D","C","A","E"));
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));


	}

}
