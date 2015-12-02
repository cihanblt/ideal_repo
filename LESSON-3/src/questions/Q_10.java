/*
 * System.gc() komutunun nas�l �al��t���n� bir uygulama �zerinde g�steriniz.Uygulama main() yordam� �zerinden s�nanabilir olmamla�d�r.
 */
package questions;

class NesneOlustur {
	int i;

	public NesneOlustur(int i) {
		this.i = i;
		System.out.println(i + ".Nesne olu�turuluyor.");
	}

	public void finalize() {
		System.out.println(i + ".Nesne yok ediliyor.");
	}
}

public class Q_10 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new NesneOlustur(i);
		}
		System.out.println();
		System.gc();

	}

}
