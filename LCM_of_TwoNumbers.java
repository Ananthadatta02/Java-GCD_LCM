package gcd_lcm;

import java.util.Scanner;

public class LCM_of_TwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1 = s.nextInt();
		System.out.println("Enter 2nd Number");
		int num2 = s.nextInt();
		int gcf = 1;
		for(int i=1;i<=num1 && i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcf = i;
			}
		}
		int lcm = (num1*num2)/gcf;
		System.out.println("LCM of "+num1+" & "+num2+" is:-"+lcm);
	}
}
