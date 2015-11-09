package examples;

class Kopek {
	public Kopek() {
		System.out.println("Hav Hav");
	}
}

public class StaticTopluDegerAtama {

	static int x;
	static double y;
	static Kopek kp;

	static {
		x = 5;
		y = 6.89;
		kp = new Kopek();
	}

	public static void main(String[] args) {
		new StaticTopluDegerAtama();
		System.out.println("x -> " + x);
		System.out.println("y -> " + y);
		System.out.println("kp -> " + kp);
	}

}

/*
 * Static alanlara toplu de�er atama
 * 
 * Static alanlara toplu de�er vermek i�in kullan�lan bu �bek, yaln�zca,
 * StaticTopluDeperAtama s�n�f�ndan nesne olu�turuldu�u zaman veya bu s�n�fa ait
 * herhangi bir static alana eri�ilmeye �al���ld��� zaman (static alanlara
 * eri�mek i�in ilgili s�n�fa ait bir nesne olu�turmak zorunda de�ilsiniz), bir
 * kez �a��r�l�r.
 *
 */