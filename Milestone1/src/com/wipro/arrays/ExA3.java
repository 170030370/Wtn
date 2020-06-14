package com.wipro.arrays;

public class ExA3 {
	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,4,5};
		int i;
		int k=Integer.parseInt(args[0]);
		int index=-1;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				index=i;
			}
		}
		if(index==-1)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(""+index);	
		}
	}
}
