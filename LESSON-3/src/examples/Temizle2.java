package examples;

class Elma2 {
	int i = 0;

	Elma2(int y) {
		this.i = y;
		System.out.println("Elma nesnesi olu�turuluyor = " + i);
	}

	public void finalize() {// Hers�n�f�n i�erisinde default olarak
							// bulunmaktad�r. Ayn� default constructor gibi.
		System.out.println("Elma nesnesi yok ediliyor = " + i);
	}
}

public class Temizle2 {

	public static void main(String[] args) {
		for (int y = 0; y < 5; y++) {
			Elma2 e = new Elma2(y);
		}
		System.gc();// ��p toplay�c�s�n� �a��rd�k.
		for (int y = 5; y < 11; y++) {
			Elma2 e = new Elma2(y);
		}

	}

}