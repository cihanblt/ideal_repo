/*
 * Ýki yapýlandýrýcýya sahip bir sýnýf yazýnýz; yapýlancýlardan birirsi diðerini 
 * this kelimesini kullanarak çaðýrýnýz.Uygulama main() yordamý üzerinde sýnanabilir olmalýdýr.
 */

package questions;

class Kahvaltý {
	public Kahvaltý() {
		this(5);
		System.out.println("Yedim.");
	}

	public Kahvaltý(int i) {
		System.out.println("Bugun kahvaltýda " + i + " adet zeytin");
	}
}

public class Q_6 {

	public static void main(String[] args) {
		new Kahvaltý();
	}

}
