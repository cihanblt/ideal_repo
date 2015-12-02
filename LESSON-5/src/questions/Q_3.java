/*
 * A sýnýfýndan türetilmiþ B sýnýfý, B sýnýfýndan türetilmiþ C sýnýfý oluþturunuz. Her
 * sýnýfýn kendisine ait varsayýlan yapýlandýrýcýsý olmalýdýr ve her sýnýfýn yapýlandýrýcýsý
 * içerisinde ekrana "Selam ben A sýnýfý..." þeklinde yazdýrýlmalýdýr. Bu gereksinimler 
 * doðrultusunda kalýtým ve ilk deðer alma sýrasýný gösteren bir uygulama geliþtiriniz.
 */

package questions;

class A {
	public A() {
		System.out.println("Selam ben A");
	}
}

class B extends A {
	public B() {
		System.out.println("Selam ben B");
	}
}

class C extends B {
	public C() {
		System.out.println("Selam ben C");
	}
}

public class Q_3 {
	public static void main(String[] args) {
		new C();
	}
}
