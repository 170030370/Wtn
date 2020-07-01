package com.wipro.exceptionhandling;
import java.util.Scanner;
public class ExE1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,k,m=0;
		try
		{
			System.out.println("Enter size of an array : ");
			int n=sc.nextInt();
			System.out.println("enter elements : ");
			int a[]=new int[n];
			for(i=0;i<n;i++) {
				a[i]=sc.nextInt();
				}
			System.out.println("Enter the index value : ");
			k=sc.nextInt();
			m=a[k];
		}
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		catch(NumberFormatException e) {
			System.out.println("Number format Exception Occurs");
		}
		System.out.println("Element is :"+m);
		
	}
}
