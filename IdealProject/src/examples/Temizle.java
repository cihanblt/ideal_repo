package examples;

class Elma {
	int i = 0;

	Elma(int y) {
		this.i = y;
		System.out.println("Elma nesnesi oluþturuluyor = " + i);
	}

	public void finalize() {
		System.out.println("Elma nesnesi yok ediliyor = " + i);
	}
}

public class Temizle {

	public static void main(String[] args) {
		for (int y = 0; y < 5; y++) {
			Elma e=new Elma(y);
		}
		for (int y = 5; y < 11; y++) {
			Elma e=new Elma(y);
		}

	}

}

/*
*Eðer uygulamanýz çok fazla sayýda çöp nesnesi(kullanýlmayan nesne) üretmiyorsa, çöp toplayýcýsý devreye girmeyebilir.
*Bir baþka nokta ise System.gc() ile çöð toplayýcýsýný tetiklemezsek, çöp toplayýcýsýnýn nezaman devreye girip çöp haline
*dönmüþ olan nesneleri bellekten temizleyeceði bilinmez
*/