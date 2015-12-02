/*
 * System.gc() komutunun nasýl çalýþtýðýný bir uygulama üzerinde gösteriniz.Uygulama main() yordamý üzerinden sýnanabilir olmamlaýdýr.
 */
package questions;

class NesneOlustur {
	int i;

	public NesneOlustur(int i) {
		this.i = i;
		System.out.println(i + ".Nesne oluþturuluyor.");
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
