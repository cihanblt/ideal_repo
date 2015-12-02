package com.ideal.Encapsulaion;

public class A implements Stable {
	private String connName;
	private String pass;
//	public A(String connName,String pass) {
//		this.connName = connName;
//		this.pass = pass;
//	}
	public A() {
		System.out.println("a constructor");
	}
	public void login(){
		System.out.println("connName = " + this.connName);
		System.out.println("password =" + this.pass);
	}
	
}
