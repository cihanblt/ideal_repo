/*
 * Varsayýlan yapýlandýrýcýsý(cunstructor) olan bir sýnýf yazýnýz.Bu sýnýfýda daha sonra bir uygulama içerisinde new ile oluþturunuz.
 */

package questions;

class Kus{
	public Kus() {
		System.out.println("PAÞA PAÞA CÝCÝ KUÞ....");
	}
}

public class Q_1 {

	public static void main(String[] args) {
		new Kus();
	}

}
