package com.wipro.arrays;

public class ExA10 {
public static void main(String[] args) {
	int a[]={1, 0, 1, 0, 0, 1, 1};
	int i;
	int e[]=new int[a.length];
	int ei=0,oi=a.length-1;
	for(i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			e[ei]=a[i];
			ei++;
		}
		else
		{
			e[oi]=a[i];
			oi--;
		}
	}
	System.out.print(""+e[0]);
	for(i=1;i<a.length;i++)
	{
		System.out.print(" , "+e[i]);
	}
}
}
