package com.wipro.flowcontrolstatements;

public class Ex13A {
	public static void main(String[] args) {
		int a=10,b=99;
		for(int n=a;n<=b;n++)
		{
			int flag=0;
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
	            {
	                flag = 1;
	                break;
	            }
			}
			if(flag==0)
			{
				System.out.println(+n+" ");
			}
		}
	}
}
