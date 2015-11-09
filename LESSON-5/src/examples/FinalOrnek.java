package examples;

class Kutu {
	int i = 0;
}

public class FinalOrnek {

	final int X_SABIT_DEGER = 34;
	final static int Y_SABIT_DEGER = 35;
	final int A_SABIT_DEGER = (int) (Math.random() * 50);
	final Kutu k = new Kutu(); // k referansýnýn göstermiþ olduðu obje adresi
								// final ile sabitlendi. Deðiþtirilemez

	public static void main(String[] args) {
		FinalOrnek fo = new FinalOrnek();

		// fo.X_SABIT_DEGER=15;// !HATA!
		// fo.Y_SABIT_DEGER=16;// !HATA!
		// fo.A_SABIT_DEGER=17;// !HATA!

		fo.k.i = 35;// Doðru
		// fo.k=new Kutu();// !HATA!

		System.out.println("X_SABIT_DEGER = " + fo.X_SABIT_DEGER);
		System.out.println("Y_SABIT_DEGER = " + fo.Y_SABIT_DEGER);
		System.out.println("A_SABIT_DEGER = " + fo.A_SABIT_DEGER);
		System.out.println("Kutu.i = " + fo.k.i);

	}

}
