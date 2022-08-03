package com.masaiQ2;

public class Lion {
	String name;
	boolean isHungry;
	int age;
	static int totalDeaths;
	static void printKillings() {
		System.out.println("Total killings by lions in jungle"+totalDeaths);

	}
	void thinking() {
		if(isHungry==true&&age<2) {
			System.out.println("Lion name is  "+name+"   Calling Mom");
		}
	
		if( isHungry==true&&age>12) {
			totalDeaths= totalDeaths+2;
			System.out.println("Lion name is   "+name+"  has eaten two animal");
		}
		if(isHungry==true&&age<=12&&age>=2) {
			totalDeaths++;
			System.out.println("Lion name is  "+name+"   has eaten one animal");

		}
		if (isHungry==false) {
			System.out.println(name+"  is sleeping");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion1 =new Lion();
		Lion lion2 =new Lion();
		Lion lion =new Lion();
		lion1.name="lion01";
		lion1.isHungry=true;
		lion1.age=33;
		lion2.name="lion02";
		lion2.isHungry=true;
		lion2.age=11;
		lion.name="lion03";
		lion.isHungry=false;
		
		
		lion1.thinking();
		lion2.thinking();
		lion.thinking();
		Lion.printKillings();
		
		
	}

}
