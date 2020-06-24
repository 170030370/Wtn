package com.wipro.overridingandpolymorphism;
class Fruit
{
	String name;
	String taste;
	int size;
	void eat()
	{
		System.out.println("Fruit and Taste");
	}
}
class Orange extends Fruit
{
	void eat()
	{
		System.out.println("Orange and Sweet");
	}
}
class Apple extends Fruit
{
	void eat()
	{
		System.out.println("Apple and Sweet");
	}
}
public class ExOP1 {
	public static void main(String[] args) {
		Fruit a=new Apple();
		a.eat();
		Fruit o=new Orange();
		o.eat();
	}
}
