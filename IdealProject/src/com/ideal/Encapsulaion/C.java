package com.ideal.Encapsulaion;

public class C extends B{
	public static String VALUE = "IDEAL";
	static int ab = 14;
	
 	private C() {
		super();
		System.out.println("c construcor");
	}
//	public void mA(){
//		System.out.println("mA() metodu in C");
//	}
//	
 	public static C newInstance(){
 		return new C();
 	}
	public void mC(int ab){
		System.out.println(ab + C.VALUE);
	}
//	public void mC(int a){
//		System.out.println("mC() method with parameter = " + a);
//	}
	
	public void mA(int i,String name){
//		super.mA(10, "asd");
		System.out.println("biz bunu override ettik ama yinede superdekini çalýþtýrýyoruz...");
	}
	
	public void mB(){
		System.out.println("asdsa");
	}
}
