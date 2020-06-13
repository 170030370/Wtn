package com.wipro.flowcontrolstatements;

public class Ex15A {
	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Please enter an integer number");
		}
		else
		{
			int n=Integer.parseInt(args[0]);
			int i,k;
			for(i=1;i<=n;i++)
			{
				for(k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}
