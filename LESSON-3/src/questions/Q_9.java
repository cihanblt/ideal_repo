/*
 * Static yordamlar(sýnýf yordamlarý) ile static olamayan yordamlar(nesne yordamlarý) arasýndaki farký bir uygulama üzerinde gösteriniz.
 */
package questions;

public class Q_9 {

	int elma_sayisi;
	String kisi;

	public void elmaVer(int i, String birey) {
		elma_sayisi = i;
		kisi = birey;
		System.out.println(birey + " kiþisine " + i + " adet elma verildi");
	}

	public static int elmaYe(Q_9 nsn) {
		System.out.println(nsn.kisi+" 1 adet elma yedi");
		return nsn.elma_sayisi--;
	}

	public static void elmaMiktariGoster(Q_9 nsn) {
		System.out.println(nsn.kisi + " kiþisine ait elma sayýsý = " + nsn.elma_sayisi);
	}

	public static void main(String[] args) {
		Q_9 kisi_1 = new Q_9();
		kisi_1.elmaVer(10, "Hasan");
		elmaYe(kisi_1);
		elmaYe(kisi_1);
		elmaYe(kisi_1);
		elmaYe(kisi_1);

		Q_9 kisi_2 = new Q_9();
		kisi_2.elmaVer(10, "Cihan");
		elmaYe(kisi_2);
		elmaYe(kisi_2);
		elmaYe(kisi_2);
		elmaYe(kisi_2);
		elmaYe(kisi_2);
		elmaYe(kisi_2);

		Q_9 kisi_3 = new Q_9();
		kisi_3.elmaVer(10, "Erdem");
		elmaYe(kisi_3);
		elmaYe(kisi_3);

		System.out.println();
		elmaMiktariGoster(kisi_1);
		elmaMiktariGoster(kisi_2);
		elmaMiktariGoster(kisi_3);
	}

}
