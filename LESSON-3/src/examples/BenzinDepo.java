package examples;

class Ucak {
	String ucak_isim;
	boolean benzin_deposu_dolu = false;
	boolean benzin_deposu_kapagi_acik_mi = false;

	public Ucak(boolean depoyu_doldur, String ucak_isim) {
		benzin_deposu_kapagi_acik_mi = true;// Kapaðý açýyoruz
		benzin_deposu_dolu = depoyu_doldur;// depo dolu
		this.ucak_isim = ucak_isim;
	}

	// Kapaklarýn kapanmasýný finalize() yordamýna býraktýk.
	public void finalize() {
		if (benzin_deposu_kapagi_acik_mi) {
			benzin_deposu_kapagi_acik_mi = false;// Kapaðý kapa
			System.out.println(ucak_isim + " - kapaklarý kapatýldý");
		}
	}
}

public class BenzinDepo {

	public static void main(String[] args) {
		
		Ucak ucak_1 = new Ucak(true, "F-16");
		new Ucak(true, "F-14");

		System.gc();
		System.out.println("Ucaklara benzin dolduruldu, kapaklarý kapatýldý");

	}

}

/*
 * Dikkat edilirse Ucaklarýn kapaklarýný finalize yordamý saðlamaktadýr. Fakat
 * bu yordam nesne çöp haline geldiðinde kullanýlmaktadýr. System.gc() ile
 * finalize yordamý tetkilendiðinde ucak_1 referansýna ait nesne ucakýn kapllarý
 * kapatýlmaz. Çünkü hala bir referansa baðlý olarak kullanýmdadýr.
 */