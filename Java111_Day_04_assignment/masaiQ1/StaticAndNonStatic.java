package com.masaiQ1;

public class StaticAndNonStatic {
	/*
	 Static Variable
	A static variable is also called a class variable and is common across the objects of the class and this variable can be accessed using class name as well.
	
	Non-Static Variable
	Any variable of a class which is not static is called non-static variable or an instance variable.
	
		 */
	public int counter=0;
	public static int staticCounter=0;
	public StaticAndNonStatic() {
		counter++;
		staticCounter++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticAndNonStatic terster= new StaticAndNonStatic();
		System.out.println("nonstatic"+terster.counter);
		System.out.println("staticCounter"+terster.staticCounter);
	}

}
