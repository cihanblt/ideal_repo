/*
 * X sýnýfýndan türetilmiþ Y sýnýfý, Y sýnýfýndan türetilmiþ Z sýnýfý oluþturunuz. Her sýnýfýn
 * kendisine ait yalnýzca bir tane temel int tipinde parametre alan yapýlandýrýcýsý olmalýdýr
 * ve bunun içerisinde ekrana "Selam ben Z sýnýfý..." þeklinde ifade yazdýrýlmalýdýr. Bu
 * gereksinimler doðrultusunda kalýtým ve parametreli yapýlandýrýcýlar ile ilk deðer alma sýrasýný
 * gösteren bir uygulama geliþtiriniz. Uygulama ilk olarak Z sýnýfýna ait bir nesne oluþturularak
 * baþlatýlmalýdýr.
 */

package questions;

class X {
	public X(int x) {
		System.out.println("Selam ben X, x = " + x);
	}
}

class Y extends X {
	public Y(int y) {
		super(1);
		System.out.println("Selam ben Y, y = " + y);
	}
}

class Z2 extends Y {
	public Z2(int z) {
		super(2);
		System.out.println("Selam ben Z2, z = " + z);
	}
}

public class Q_4 {
	public static void main(String[] args) {
		new Z2(3);
	}
}
