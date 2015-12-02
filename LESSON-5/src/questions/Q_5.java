/*
 * D sýnýfýnýn ekranaBas() yordamýný iptal eden bir E sýnýfý yazýnýz.
 */
package questions;

class D {
	public void ekranaBas() {
		System.out.println("D.ekranaBas()");
	}
}

class E extends D {
	public void ekranaBas() {
		System.out.println("E.ekranaBas()");
	}
}

public class Q_5 {
	public static void main(String[] args) {
		D d = new E();
		d.ekranaBas();

		D d2 = new D();
		d2.ekranaBas();

		E e = new E();
		e.ekranaBas();
	}
}
