/*
 * Parametre alan yapýlandýrýcýya sahip bir sýnýf yazýnýz.Bu sýnýfý daha sonradan bir uygulama içinde new ile oluþturunuz.
 */
package questions;

class Kurabiye {
	
	String[] neli = { "Çikolatalý", "Üzümlü", "Sade" };
	
	public Kurabiye(int i) {
		System.out.println("Bu kurabiye " + neli[i % 2]);
	}
}

public class Q_2 {

	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			new Kurabiye(i);
		}

	}

}
