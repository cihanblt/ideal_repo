/*
 * D s�n�f�n�n ekranaBas() yordam�n� iptal eden bir E s�n�f� yaz�n�z.
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
