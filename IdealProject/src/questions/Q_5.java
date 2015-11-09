/*
 * Bir Araba sýnýfý oluþturup sýnýfýn içerisinde sur() adýnda 3 adet adaþ yordam içeren uygulamam yazýnýz.
 */
package questions;

public class Q_5 {

	public void sur() {
		System.out.println("Hangi araba arabam yok mk.");
	}

	public void sur(String araba) {
		System.out.println(araba + " al sürelim aga. Araba nerde?");
	}

	public void sur(int i, String araba) {
		System.out.println("Güzel arabaymýþ beðendim.");
	}

	public static void main(String[] args) {
		new Q_5().sur();
		new Q_5().sur("Ferrari");
		new Q_5().sur(1, "Ferrari");
	}

}
