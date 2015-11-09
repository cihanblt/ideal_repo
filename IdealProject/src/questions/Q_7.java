/*
 * finalize() yordam�n�n �a�r�laca�� bir uygulama yaz�n�z.Uygulama main() yordam� �zerinden test edilebilir olmal�d�r.
 */
package questions;

class Bocek {
	int i;

	public void bocekOlustur(int i) {
		this.i = i;
		System.out.println("B�cek olu�uyor... " + i);
	}

	public void finalize() {
		System.out.println("B�cek �ld�... " + i);
	}
}

public class Q_7 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Bocek().bocekOlustur(i);
		}
		System.gc();
	}

}
