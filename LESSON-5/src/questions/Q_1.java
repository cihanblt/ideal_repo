/*
 * T sýnýfý ve bu sýnýfdan türetilmiþ Z sýnýfý oluþturunuz. T sýnýfýnýn içerisinde 
 * 3 adet nesne yordamý (static olmayan yordam) oluþturunuz ve bu yordamlarýn türetilmiþ
 * Z sýnýfýnýn içerisinde kullanabilirliðini kanýtlayýnýz.
 */
package questions;

class T{
	public void m1() {
		System.out.println("T.m1()");
	}
	public void m2() {
		System.out.println("T.m2()");
	}
	public void m3() {
		System.out.println("T.m3()");
	}
}

class Z extends T{
	public void ekranaBas() {
		Z z=new Z();
		z.m1();
		z.m2();
		z.m3();
	}
}

public class Q_1 {
	public static void main(String[] args) {
		new Z().ekranaBas();
	}
}
