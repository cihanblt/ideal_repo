package com.ideal.Encapsulaion;

public class C extends B{
//	public void mA(){
//		System.out.println("mA() metodu in C");
//	}
//	
	public void mC(){
		System.out.println("mC() method in C");
	}
	public void mC(int a){
		System.out.println("mC() method with parameter = " + a);
	}
	
	public void mA(int i,String name){
		super.mA(10, "asd");
		System.out.println("biz bunu override ettik ama yinede superdekini çalýþtýrýyoruz...");
	}
}
