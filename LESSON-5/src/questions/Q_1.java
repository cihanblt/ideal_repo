/*
 * T s�n�f� ve bu s�n�fdan t�retilmi� Z s�n�f� olu�turunuz. T s�n�f�n�n i�erisinde 
 * 3 adet nesne yordam� (static olmayan yordam) olu�turunuz ve bu yordamlar�n t�retilmi�
 * Z s�n�f�n�n i�erisinde kullanabilirli�ini kan�tlay�n�z.
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
