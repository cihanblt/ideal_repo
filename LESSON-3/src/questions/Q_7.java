/*
 * finalize() yordamýnýn çaðrýlacaðý bir uygulama yazýnýz.Uygulama main() yordamý üzerinden test edilebilir olmalýdýr.
 */
package questions;

class Bocek {
	int i;

	public void bocekOlustur(int i) {
		this.i = i;
		System.out.println("Böcek oluþuyor... " + i);
	}

	public void finalize() {
		System.out.println("Böcek öldü... " + i);
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
