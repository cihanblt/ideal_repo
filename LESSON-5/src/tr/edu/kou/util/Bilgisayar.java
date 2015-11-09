package tr.edu.kou.util;

import tr.edu.kou.math.HesapMakinesi;

public class Bilgisayar extends HesapMakinesi {
	protected void hesapla(double a, double b) {
		System.out.println("Bilgisayar.hesapla()");
	}

	public static void main(String[] args) {
		Bilgisayar b = new Bilgisayar();
		b.hesapla(3.15, 5.6);
		HesapMakinesi hm = new HesapMakinesi();
		// hm.hesapla(3.15, 5.6); //Hata başka paket içerisinden erişilemez.
	}
}
