package practiceexample;

import java.util.Scanner;

public class SumDemo 
{

	public static void main(String[] args) 
	{
		int num, i,sum =0;
		
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number");
			int num1 = sc.nextInt();
			
			for(i = 0; i<=num1;i++)
			{
				if(i%2==1)
				{
					sum+=i;
					
			}
		
		}
		
		System.out.print("Sum f all odd numbers between 0 to "+ num1 +"="+sum);
	
      	}
		
}

