package com.wipro.flowcontrolstatements;

public class Ex1A {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println("Positive");
		}
		else if(a==0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Negative");
		}
	}
}
