package com.ideal.Encapsulaion;

import java.util.Calendar;

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
		
//		A a = new A();
//		a.mA();
//		
//		A b = new B();
//		b.mA();
//		
//		A c = new C();
//		c.mA();
//		
//		C c1 = new C();
//		c1.mA();
//		c1.mC();
		
//		B b1 = new C();
//		b1.mB();
		
//		A c = new C();
//		c.mA(0, "");
		
//		C c1 = new C();
//		c1.mC();
//		c1.mC(2015);
		
		//upcasting and downcasting
		
//		A aaa = new C(); //C aaa = new C();
//		
//		C ccc = (C)aaa;
//		
//		C ccc2 = new C();
//		A aaa2 = (A)ccc2;
		
		C c = C.newInstance();
		System.out.println(C.VALUE);
	}
}
