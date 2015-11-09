package examples;

class Elma {
	int i = 0;

	Elma(int y) {
		this.i = y;
		System.out.println("Elma nesnesi olu�turuluyor = " + i);
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
*E�er uygulaman�z �ok fazla say�da ��p nesnesi(kullan�lmayan nesne) �retmiyorsa, ��p toplay�c�s� devreye girmeyebilir.
*Bir ba�ka nokta ise System.gc() ile ��� toplay�c�s�n� tetiklemezsek, ��p toplay�c�s�n�n nezaman devreye girip ��p haline
*d�nm�� olan nesneleri bellekten temizleyece�i bilinmez
*/