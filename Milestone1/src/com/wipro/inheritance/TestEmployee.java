package com.wipro.inheritance;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e =new Employee();
		e.setMember("Indu");
		e.setAnnualsalary(120000);
		e.setYear(2020);
		e.setNationalinsurance("12T34K");
		System.out.println(e.getMember());
		System.out.println(e.getAnnualsalary());
		System.out.println(e.getYear());
		System.out.println(e.getNationalinsurance());
	}
}
