package com.wipro.flowcontrolstatements;

public class Ex12A {
	public static void main(String args[]) {
		int n=Integer.parseInt(args[0]);
		int flag=0;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
            {
                flag++;
            }
		}
		if(flag==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}
}
