package com.wipro.abstractclasses;

abstract class Instrument {
	abstract void play();

}
class Piano extends Instrument
{
	void play()
	{
		System.out.println("Piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument
{
	void play()
	{
		System.out.println("Piano is playing toot toot toot toot");
	}
	
}
class Guiter extends Instrument
{
	void play()
	{
		System.out.println("Piano is playing tin tin tin");
	}
	
}

public class InstrumentDemo {
	public static void main(String[] args) {
		Instrument [] inst=new Instrument[10];
		for(int i=0;i<3;i++)
		{
			inst[i]=new Piano();
			inst[i].play();
			
		}
		for(int i=3;i<7;i++)
		{
			inst[i]=new Flute();
			inst[i].play();
			
		}
		for(int i=7;i<10;i++)
		{
			inst[i]=new Guiter();
			inst[i].play();
			
		}
		for(int i=0;i<10;i++)
		{
			if(inst[i] instanceof Piano)
			{
				System.out.println(i+"Piano Object");
			}
			else if(inst[i] instanceof Flute)
			{
				System.out.println(i+"Flute Object");
			}
			else
			{
				System.out.println(i+"Guiter Object");
			}
			
			
		}
	}
}

