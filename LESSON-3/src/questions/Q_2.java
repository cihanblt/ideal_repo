/*
 * Parametre alan yap�land�r�c�ya sahip bir s�n�f yaz�n�z.Bu s�n�f� daha sonradan bir uygulama i�inde new ile olu�turunuz.
 */
package questions;

class Kurabiye {
	
	String[] neli = { "�ikolatal�", "�z�ml�", "Sade" };
	
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
