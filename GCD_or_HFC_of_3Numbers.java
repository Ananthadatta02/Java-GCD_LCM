package gcd_lcm;

import java.util.Scanner;

public class GCD_or_HFC_of_3Numbers 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int num1 = s.nextInt();		
		System.out.println("Enter the 2nd Number");
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int gfc = 1;
		for(int i=1;i<=num1 && i<=num2 && i<=num3;i++)
		{
			if(num1%i == 0 && num2%i ==0 && num3%i ==0)
				gfc = i;
		}
		System.out.println("GFC of "+num1+" & "+num2+" is:-" + gfc);
	}
}
