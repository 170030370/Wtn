package com.wipro.arrays;

public class ExA9 {
	public static void main(String[] args) 
	{
		int a[]= {1,10,10,4,5,8};
		int i;
		int n[]=new int[a.length];
		int c=0;
		for(i=0;i<(a.length);i++)
		{
			if(a[i]!=10)
			{
				n[c++]=a[i];
			}
		}
		for(i=c;i<a.length;i++)
		{
				n[i]=0;
		}
			for(i=0;i<a.length;i++)
			{
				System.out.print(+n[i]+" ");
			}
		}
	}
