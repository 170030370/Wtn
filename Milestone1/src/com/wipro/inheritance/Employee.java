package com.wipro.inheritance;

public class Employee extends Person{
	double annualsalary;
	int year;
	String nationalinsurance;
	public double getAnnualsalary() {
		return annualsalary;
	}
	public void setAnnualsalary(double annualsalary) {
		this.annualsalary = annualsalary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getNationalinsurance() {
		return nationalinsurance;
	}
	public void setNationalinsurance(String nationalinsurance) {
		this.nationalinsurance = nationalinsurance;
	}
}
