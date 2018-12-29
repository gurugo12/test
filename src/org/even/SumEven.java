package org.even;

public class SumEven {

	public static void main(String[] args) 
	{
		int a=0;
		
		for(int i=1;i<=100;i++)
		{
	    if(i%2==0)
	    {
		a++;	
	    }
	    
		}

		System.out.println("Count of the Even number is "+a);
	}
		
	
}
