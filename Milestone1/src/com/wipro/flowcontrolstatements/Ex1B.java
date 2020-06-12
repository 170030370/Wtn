package com.wipro.flowcontrolstatements;

public class Ex1B {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a>=0 && b>=0)
		{
			if(a%10==b%10)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}
		else
		{
			System.out.println("Enter Non-Negative Integers Only");
		}
	}
}
