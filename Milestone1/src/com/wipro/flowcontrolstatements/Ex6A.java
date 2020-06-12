package com.wipro.flowcontrolstatements;

public class Ex6A {
	public static void main(String[] args) {
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(age>=1&&age<=58)
		{
			if(gender.equals("Female"))
			{
				System.out.println("8.2%");
			}
			else
			{
				System.out.println("8.4%");
			}
		}
		if(age>=59&&age<=100)
		{
			if(gender.equals("Female"))
			{
				System.out.println("9.2%");
			}
			else
			{
				System.out.println("10.5%");
			}
		}
	}
}
