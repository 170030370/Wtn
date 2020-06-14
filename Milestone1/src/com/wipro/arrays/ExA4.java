package com.wipro.arrays;

public class ExA4 {
	public static void main(String[] args) {
		int a[]=new int[]{85,86};
		int i;
		for(i=0;i<a.length;i++)
		{
			String str=Character.toString((char) a[i]);
			System.out.print(str+" ");
		}
		
	}
}
