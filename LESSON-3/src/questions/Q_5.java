/*
 * Bir Araba s�n�f� olu�turup s�n�f�n i�erisinde sur() ad�nda 3 adet ada� yordam i�eren uygulamam yaz�n�z.
 */
package questions;

public class Q_5 {

	public void sur() {
		System.out.println("Hangi araba arabam yok mk.");
	}

	public void sur(String araba) {
		System.out.println(araba + " al s�relim aga. Araba nerde?");
	}

	public void sur(int i, String araba) {
		System.out.println("G�zel arabaym�� be�endim.");
	}

	public static void main(String[] args) {
		new Q_5().sur();
		new Q_5().sur("Ferrari");
		new Q_5().sur(1, "Ferrari");
	}

}
