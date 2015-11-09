package examples;

class Ucak {
	String ucak_isim;
	boolean benzin_deposu_dolu = false;
	boolean benzin_deposu_kapagi_acik_mi = false;

	public Ucak(boolean depoyu_doldur, String ucak_isim) {
		benzin_deposu_kapagi_acik_mi = true;// Kapa�� a��yoruz
		benzin_deposu_dolu = depoyu_doldur;// depo dolu
		this.ucak_isim = ucak_isim;
	}

	// Kapaklar�n kapanmas�n� finalize() yordam�na b�rakt�k.
	public void finalize() {
		if (benzin_deposu_kapagi_acik_mi) {
			benzin_deposu_kapagi_acik_mi = false;// Kapa�� kapa
			System.out.println(ucak_isim + " - kapaklar� kapat�ld�");
		}
	}
}

public class BenzinDepo {

	public static void main(String[] args) {
		
		Ucak ucak_1 = new Ucak(true, "F-16");
		new Ucak(true, "F-14");

		System.gc();
		System.out.println("Ucaklara benzin dolduruldu, kapaklar� kapat�ld�");

	}

}

/*
 * Dikkat edilirse Ucaklar�n kapaklar�n� finalize yordam� sa�lamaktad�r. Fakat
 * bu yordam nesne ��p haline geldi�inde kullan�lmaktad�r. System.gc() ile
 * finalize yordam� tetkilendi�inde ucak_1 referans�na ait nesne ucak�n kapllar�
 * kapat�lmaz. ��nk� hala bir referansa ba�l� olarak kullan�mdad�r.
 */