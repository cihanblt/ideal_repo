package examples;

class Araba {

	int kapi_sayisi;
	int vites_sayisi;

	public Araba(int adet) {
		kapi_sayisi = adet;
	}

	public Araba(int adet, int sayi) {
		kapi_sayisi = adet;
		vites_sayisi = sayi;
	}
}

public class VarsayilanYapilandiriciVersiyon2 {

	public static void main(String[] args) {

		// Araba ar=new Araba(); // HATA! Bu satýr anlamlý deðil; Yapýlandýrýcý tanýmlý deðil.
		// yapýlandýrýcýsý yok
		Araba ar1 = new Araba(2);
		Araba ar2 = new Araba(4, 5);

	}

}
/*
 *Eðer biz kendimize ait özel yapýlandýrýcýlar tanýmlarsak, þöyle demiþ oluruz: "Ben ne yaptýðýmý biliyorum, lütfen karýþma".
 *Bu durumda olasý bütün yapýlandýrýcýlar bizim tarafýmýzdan yazýlmasý gerekir. 
 * */
