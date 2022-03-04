package practiceexample;

import java.util.Scanner;

public class Fibonancy 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number-");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(sumoffib(n));
	}
	
		public static int sumoffib(int n)
		{

			int a=0, b=1, c=0, d=0;
			for (int i=3; i<=n; i++)
			{
				c=a + b;
				b=c;
				a=b;
				d=d + c;
		}
		return d;
	}

}
