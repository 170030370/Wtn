package com.wipro.arrays;

public class ExA5 {
	public static void main(String[] args) {
		int a[]=new int[]{10,9,3,4,5};
		int temp=0,i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];    
	                   a[i] = a[j];    
	                   a[j] = temp;    
				}
			}
		}
		System.out.println("1st Largest "+a[a.length-1]);
		System.out.println("2nd Largest "+a[a.length-2]);
		System.out.println("1st Smallest "+a[0]);
		System.out.println("2nd Smallest "+a[1]);
	}
}
