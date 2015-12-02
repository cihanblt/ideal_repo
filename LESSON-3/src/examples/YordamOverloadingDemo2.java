package examples;

public class YordamOverloadingDemo2 {

	public void toplamaYap(int a, int b) {
		int sonuc = a + b;
		System.out.println("sonuc - 1 =" + sonuc);
	}

	public void toplamaYap(int a, double b) {
		double sonuc = a + b;
		System.out.println("sonuc - 2 =" + sonuc);
	}

	public void toplamaYap(double a, int b) {
		double sonuc = a + b;
		System.out.println("sonuc - 3 =" + sonuc);
	}

	public static void main(String[] args) {

		YordamOverloadingDemo2 mod2 = new YordamOverloadingDemo2();
		mod2.toplamaYap(3, 4);
		mod2.toplamaYap(3, 5.5);
		mod2.toplamaYap(6.8, 4);

	}

}

/*
 *javada ada� yordamlar parametrelerine g�re ay�t edilir.
 *
 *toplamaYap() yordam�n�n ilki iki adeet temel int tipinde parametre alarak di�er ada� yordamlardan ayr�lmaktad�r;
 *geriye kalan iki adet toplamaYap() yordam� ise ayn� tip parametreler alamaktad�r. Bunlar temel double tipi ve int tipi,
 *bu iki yordam� birbirinden farkl� k�lan, parametrelerin s�ras�d�r. 
 * 
 * Java dilinde d�n��tiplerine g�re yordamlar�n ay�rt edilmesi kabul g�rmez; ay�rt edilmesini sa�layan tek �ey parametrelerindeki farkl�l�kt�r.
 * 
 * */
 