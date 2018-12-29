package org.even;

import java.util.Scanner;

public class Case {
	
	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		System.out.println("Enter the Choice");
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		int d;
		switch(c)
		{
		case 1:
			
		d=a+b;
		System.out.println("Sum is "+d);
			
		case 2:	
		d=a*b;	
		System.out.println("Multiplication is "+d);	
		
		default:
		System.out.println("Out of range");
		}	
		
	}

}
