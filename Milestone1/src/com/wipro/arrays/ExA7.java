package com.wipro.arrays;

import java.util.Arrays;

public class ExA7 {
	public static void main(String[] args) {
		int a[]={12,34,12,45,67,89};
		int temp[]=new int[a.length];
		int i,j=-1;
		Arrays.sort(a);
		for(i=0;i<a.length-1;i++)
		{
				if(a[i]!=a[i+1])
				{ 
	                   temp[++j] = a[i];        
				}
		}
		temp[++j]=a[a.length-1];
		for(i=0;i<=j;i++)
		{
			System.out.print(" "+temp[i]);
		}
	}	
}
