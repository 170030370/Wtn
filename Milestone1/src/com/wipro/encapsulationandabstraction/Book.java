package com.wipro.encapsulationandabstraction;

public class Book{
	String name;
	double price;
	String author;
	int qtyInstock;
	Book(String name){
	this.name=name;
	}
	public String getName() {
	return name;
	}
	public double getPrice() {
	return price;
	}
	public void setPrice(double price) {
	this.price = price;
	}
	void getAuthor() {
	System.out.println("Name is : "+Author.name);
	System.out.println("email is : "+Author.email);
	System.out.println("Gender is : "+Author.gender);
	}
	public int getQtyInstock() {
	return qtyInstock;
	}
	public void setQtyInstock(int qtyInstock) {
	this.qtyInstock = qtyInstock;
	}
	public static void main(String args[]) {
	Book b=new Book("Tales");
	Author a=new Author("Indu","Indu@gmail.com",'f');
	b.setPrice(568.50);
	b.setQtyInstock(89);
	System.out.println("Name of book :"+b.getName());
	System.out.println("Price of book :"+b.getPrice());
	System.out.println("qtyIn stock of book :"+b.getQtyInstock());
	b.getAuthor();
	}	
}
