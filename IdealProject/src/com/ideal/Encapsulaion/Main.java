package com.ideal.Encapsulaion;

public class Main {
	public static void main(String[] args) {
//		Customer customer = new Customer();
//		customer.setNationalId(111111111);
//		customer.setName("hasan");
//		customer.setLastName("bozaci");
//		
//		System.out.println(customer.getNationalId());
//		System.out.println(customer.getName());
//		System.out.println(customer.getLastName());
		
		A a = new A();
		a.mA();
		
		A b = new B();
		b.mA();
		
		A c = new C();
		c.mA();
		
		C c1 = new C();
		c1.mA();
		c1.mC();
		
		B b1 = new C();
		b1.mB();
		
		
		
	}
}
