package com.wipro.flowcontrolstatements;

public class Ex16A {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int r,rev=0;
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		System.out.println(""+rev);
	}
}
