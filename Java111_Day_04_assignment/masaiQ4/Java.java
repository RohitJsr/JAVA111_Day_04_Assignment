package com.masaiQ4;

public class Java {
	void nonstatic(int n) {
		 if(n<0) {
			System.out.println("Error");

		}
		 else if(n%1==0&&n%2!=0) {
			System.out.println(n);
			
		}
		else if(n%2==0) {
			int a= (n/10+1)*10;
		
			System.out.println(a);
			
		}
	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java Java1= new Java();
		Java Java2= new Java();
		Java Java3= new Java();
		Java1.nonstatic(44);
		Java2.nonstatic(45);
		Java3.nonstatic(-5);
		
		
	}

}
