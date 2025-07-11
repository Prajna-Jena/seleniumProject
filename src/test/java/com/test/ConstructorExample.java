package com.test;
 class first{
	  int i=12;
	 first(){
		 System.out.println("Base class");
	 }
	
}
public class ConstructorExample extends first{
	 
   int i=13;
   ConstructorExample(){
   System.out.println("Child Class" +super.i+i);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample child=new ConstructorExample();
       
	}

}
