package com.wipro.inheritance;

public class Bird extends Animal{
	void fly()
	{
		System.out.println("Method Fly");
	}
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.eat();
		a.play();
		Bird b=new Bird();
		b.eat();
		b.play();
		b.fly();
	}
}
