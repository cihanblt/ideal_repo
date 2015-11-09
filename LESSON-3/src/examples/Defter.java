package examples;

class Kagit {
	public Kagit(int i) {
		System.out.println("Kagit (" + i + ")");
	}
}

public class Defter {

	Kagit k1 = new Kagit(1);

	public Defter() {
		System.out.println("Defter() yapýlandýrýcý");
		Kagit k2 = new Kagit(33);
	}

	Kagit k2 = new Kagit(2);

	public void islemTamam() {
		System.out.println("Ýþlem tamam");
	}

	Kagit k3 = new Kagit(3);

	public static void main(String[] args) {
		Defter d = new Defter();
		d.islemTamam();
	}

}

/*
 *ilk deðer alma sýrasý: 
 *
 * Nesnelere ait global alanlara baþlangýç deðerleri derleyici tarafýndan hemen
 * verilir; üstelik, yapýlandýrýcýlardan(constructor) bile önce.Belirtilen
 * alanlarýn konumu hangi sýrada ise baþlangýç deðeri alma sýrasýda ayný olur.
 */