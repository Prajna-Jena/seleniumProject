package com.test;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

	public static void main(String[] args) {
		//Hashmap does not maintain any order, it does not conain any duplicate key
		//it can store number of null values but only one null key
		//hashmap is not threadsafe
		HashMap<String,String>capitols=new HashMap<String,String>();
		capitols.put("Delaware", "Dover");
		capitols.put("Maryland", "Annapolis");
		capitols.put("Pennsylvania", "Harrisburg");
		capitols.put("New Jersey", "Trenton");
		capitols.put(null, "Bear");
		capitols.put("Baltimore", null);
		capitols.put("connecticut", null);
		System.out.print(capitols.get(null));
		Iterator<String>it=capitols.keySet().iterator();
		while(it.hasNext())
		{
			String key=it.next();
			System.out.println(capitols.get(key));
		}

	}

}
