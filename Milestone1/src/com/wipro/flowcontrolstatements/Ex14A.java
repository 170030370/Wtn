package com.wipro.flowcontrolstatements;

public class Ex14A {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			sum=r+sum;
			n=n/10;
		}
		System.out.println(""+sum);
	}
}
