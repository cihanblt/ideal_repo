package tr.edu.kou.gerekli;

class Kahve {
	private int siparis_sayisi;

	private Kahve() {
	}

	public void kahveHazirla() {
		System.out.println(siparis_sayisi + " adet kahve hazırlandı");
	}

	public static Kahve siparisGarson(int sayi) {
		Kahve kahve = new Kahve(); // Dikkat
		kahve.siparis_sayisi = sayi;
		kahve.kahveHazirla();
		return kahve;
	}
}
