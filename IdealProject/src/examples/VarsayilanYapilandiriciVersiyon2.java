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

		// Araba ar=new Araba(); // HATA! Bu sat�r anlaml� de�il; Yap�land�r�c� tan�ml� de�il.
		// yap�land�r�c�s� yok
		Araba ar1 = new Araba(2);
		Araba ar2 = new Araba(4, 5);

	}

}
/*
 *E�er biz kendimize ait �zel yap�land�r�c�lar tan�mlarsak, ��yle demi� oluruz: "Ben ne yapt���m� biliyorum, l�tfen kar��ma".
 *Bu durumda olas� b�t�n yap�land�r�c�lar bizim taraf�m�zdan yaz�lmas� gerekir. 
 * */
