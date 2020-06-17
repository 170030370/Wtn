package com.wipro.classesandobjects;

public class Box {
	double height,length,width;
	Box(double height,double length,double width)
	{
		this.height=height;
		this.length=length;
		this.width=width;
	}
	double volume()
	{
		return height*length*width;
	}
	public static void main(String[] args) {
		Box b1=new Box(12.1,12.2,12.3);
		System.out.println(""+b1.volume());
	}
}
