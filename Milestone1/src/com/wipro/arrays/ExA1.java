package com.wipro.arrays;

public class ExA1 {
	public static void main(String[] args) {
		int a[]=new int[args.length];
		int i;
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int sum=0,avg;
		for(i=0;i<args.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sun is "+sum);
		System.out.println("Average is"+(sum/args.length));
	}
}
