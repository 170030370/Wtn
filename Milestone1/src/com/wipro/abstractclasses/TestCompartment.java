package com.wipro.abstractclasses;

import java.util.Random;

abstract class Compartment
{
	public abstract String notice();
}
class FirstClass extends Compartment
{
	public String notice()
	{
		String s="FirstClass";
		return s;
	}
}
class Ladies extends Compartment
{
	public String notice()
	{
		String s="Ladies";
		return s;
	}
	
}
class General extends Compartment
{
	public String notice()
	{
		String s="General";
		return s;
	}
	
}
class Luggage extends Compartment
{
	public String notice()
	{
		String s="Luggage";
		return s;
	}
	
}
public class TestCompartment 
{
	public static void main(String[] args) 
	{
		Compartment [] com=new Compartment[10];
		Random rand=new Random();
		for(int i=0;i<10;i++)
		{
			int randomnum=rand.nextInt(4)+1;
			if(randomnum==1)
				com[i]=new FirstClass();
			else if(randomnum==2)
				com[i]=new Ladies();
			else if(randomnum==3)
				com[i]=new General();
			else if(randomnum==4)
				com[i]=new Luggage();
			com[i].notice();
		}
	}
}
