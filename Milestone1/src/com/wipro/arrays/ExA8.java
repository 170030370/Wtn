package com.wipro.arrays;

public class ExA8 {
	public static void main(String[] args) {
		int a[]= {1,6,4,7,9};
		int i,j,k;
		int n=a.length;
		for(i=0;i<n;i++)
		{
			if(a[i]==6)
			{
				break;
			}
		}
		for(j=0;j<n;j++)
		{
			if(a[j]==7)
			{
				break;
				
			}
		}
		int sum=0,sum1=0;
		for(k=0;k<n;k++)
		{
			sum+=a[k];
		}
		if(!(i<j))
		{
			System.out.println(""+sum);
		}
		else
		{
			for(k=i;k<=j;k++)
			{
				sum1+=a[k];
			}
			System.out.println(""+(sum-sum1));
		}
		
	}
}
