package com.wipro.flowcontrolstatements;

public class Ex2A {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	if((a&1)==0)
	{
		System.out.println("Even");
	}
	else
	{
		System.out.println("Odd");
	}
}
}
