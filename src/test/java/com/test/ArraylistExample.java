package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arraylist is a default class and it behaves like a dynamic array. it maintains the order to store the data
		ArrayList<Object> arr=new ArrayList<Object>();
		System.out.print(arr.size());//it always calculates the physical capacity which is 0.
        arr.add(23);
        arr.add("hi");
        arr.add(true);
        arr.add(2.3);
        System.out.print(arr);
        System.out.print(arr.get(2));
        System.out.print(arr.size()+1);
        arr.add("hello");
        arr.add(3.65);
        System.out.println(arr.size());
        System.out.println("----");
        for(int i=0;i<arr.size();i++) {
        	System.out.println(arr.get(i));
        }
        System.out.println("----");
        for(Object a:arr) {
        	System.out.println(a);
        }
        System.out.println("----");
        Iterator<Object> it=arr.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	}

}
