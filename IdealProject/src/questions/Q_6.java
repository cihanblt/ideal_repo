/*
 * �ki yap�land�r�c�ya sahip bir s�n�f yaz�n�z; yap�lanc�lardan birirsi di�erini 
 * this kelimesini kullanarak �a��r�n�z.Uygulama main() yordam� �zerinde s�nanabilir olmal�d�r.
 */

package questions;

class Kahvalt� {
	public Kahvalt�() {
		this(5);
		System.out.println("Yedim.");
	}

	public Kahvalt�(int i) {
		System.out.println("Bugun kahvalt�da " + i + " adet zeytin");
	}
}

public class Q_6 {

	public static void main(String[] args) {
		new Kahvalt�();
	}

}
