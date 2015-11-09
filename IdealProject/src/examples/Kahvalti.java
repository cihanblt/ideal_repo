package examples;

class Peynir {
	public Peynir(int i, String tur) {
		System.out.println("Peynir (" + i + ") --> " + tur);
	}
}

class Tabak {
	public Tabak(int i, String tur) {
		System.out.println("Tabak (" + i + ") --> " + tur);
	}
}

class Catal {
	public Catal(int i, String tur) {
		System.out.println("Catal (" + i + ") --> " + tur);
	}
}

public class Kahvalti {

	static Catal c1 = new Catal(1, "Static Alan");

	public Kahvalti() {
		System.out.println("Kahvalti() yap�land�r�c�");
	}

	Tabak t1 = new Tabak(1, "Static-olamayan alan");

	public void islemTamam() {
		System.out.println("��lem tamam");
	}

	static Catal c2 = new Catal(2, "Static Alan");

	public static void main(String[] args) {
		Kahvalti d = new Kahvalti();
		d.islemTamam();
	}

	static Tabak t4 = new Tabak(4, "Static Alan");
	static Tabak t5 = new Tabak(5, "Static Alan");

}

/*
 * Static alanlar, s�n�flara ait olan alanlarad�r ve static olmayan
 * alanlara(nesne alanlar�) g�re ba�lang�� de�erlerini daha �nce al�rlar.
 */
