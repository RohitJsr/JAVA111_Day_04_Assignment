package com.masaiQ3;

public class Student {
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll id :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student S1= new Student();
		Student S2= new Student();
		
		S1.roll=22;
		S1.marks=545;
		S1.name="Mohan";
		
		S2.roll=23;
		S2.marks=605;
		S2.name="Sohan";
		
		S1.displayStudentDetails();
		S2.displayStudentDetails();
		S1=S2;
		S1=null;
		S2=null;
		System.gc();

		
		
		
		

		
	}

}
