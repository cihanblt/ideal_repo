package com.ideal.Encapsulaion;

public class B  extends A{
	int a;
	static final String connName = "db";
	static final String pass = "12345";
	public B() {
//		super(connName,pass);
		System.out.println("b constructor");
	}
	public void mB(){
		System.out.println("mB metot");
	}

}
