package com.wipro.arrays;

public class ExA2 {
	public static void main(String[] args) {
		int a[]=new int[args.length];
		int i;
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int max=0,min=a[0];
		for(i=0;i<args.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Maximum is "+max);
		System.out.println("Minimum is "+min);
	}
}
