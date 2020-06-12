package com.wipro.flowcontrolstatements;

public class Ex3A {
	public static void main(String[] args) {
		int l=args.length;
		if(l==0)
		{
			System.out.println("No values");
		}
		else
		{
			for(int i=0;i<l-1;i++)
			{
			System.out.print(""+args[i]+",");
			}
			System.out.println(""+args[l-1]);
		}
	}
}
