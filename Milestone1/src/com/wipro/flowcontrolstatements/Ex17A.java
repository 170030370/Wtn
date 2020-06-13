package com.wipro.flowcontrolstatements;

public class Ex17A {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int r,rev=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println(+temp+" is a palindrome");
		}
		else
		{
			System.out.println(+temp+" is not a palindrome");

		}
	}
}
