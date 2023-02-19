package bankdetails;

import java.util.Scanner;

public class bankaccount { 
	 static Scanner a = new Scanner(System .in); 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println("enter your name");
		String name =  a.next();
		System.out.println("enter your bank account "); 
		String b = a.next();
		System.out.println("enter your account number");
		int c = a.nextInt();
		System.out.println("enter your account balance");
		int d = a.nextInt();
		bankaccount b1 = new bankaccount(); 
		int bankaccount ;
		
		
		{ 
			System.out.println(" enter your choice");
			bankaccount= a.nextInt();
			switch(bankaccount) {
			case 1: Scanner e = new Scanner(System.in);
			
				System.out.println("deposit amount"); 
				int f = e.nextInt();
	
				break;
			case 2: Scanner z  = new Scanner (System.in);
				System.out.println("withdraw amount");  
				int h = z.nextInt();
				
			
				break; 
			} 
			def :{ 
				System.out.println("my name is srinath");
			
		} 
		
		
				
			
		
		
		
		
	
			
		}
	} 
	

	 
	

}
