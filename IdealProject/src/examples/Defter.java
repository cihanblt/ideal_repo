package examples;

class Kagit {
	public Kagit(int i) {
		System.out.println("Kagit (" + i + ")");
	}
}

public class Defter {

	Kagit k1 = new Kagit(1);

	public Defter() {
		System.out.println("Defter() yap�land�r�c�");
		Kagit k2 = new Kagit(33);
	}

	Kagit k2 = new Kagit(2);

	public void islemTamam() {
		System.out.println("��lem tamam");
	}

	Kagit k3 = new Kagit(3);

	public static void main(String[] args) {
		Defter d = new Defter();
		d.islemTamam();
	}

}

/*
 *ilk de�er alma s�ras�: 
 *
 * Nesnelere ait global alanlara ba�lang�� de�erleri derleyici taraf�ndan hemen
 * verilir; �stelik, yap�land�r�c�lardan(constructor) bile �nce.Belirtilen
 * alanlar�n konumu hangi s�rada ise ba�lang�� de�eri alma s�ras�da ayn� olur.
 */