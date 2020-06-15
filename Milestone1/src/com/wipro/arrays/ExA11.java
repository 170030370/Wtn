package com.wipro.arrays;

public class ExA11 {
	public static void main(String[] args) {
		int a[]=new int[]{1,1,1,1,1,4,4,4};
		int count=0,i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==1||a[i]==4)
			{
				count++;
			}
		}
		if(count==a.length)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
