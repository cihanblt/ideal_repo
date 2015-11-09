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
 *javada adaþ yordamlar parametrelerine göre ayýt edilir.
 *
 *toplamaYap() yordamýnýn ilki iki adeet temel int tipinde parametre alarak diðer adaþ yordamlardan ayrýlmaktadýr;
 *geriye kalan iki adet toplamaYap() yordamý ise ayný tip parametreler alamaktadýr. Bunlar temel double tipi ve int tipi,
 *bu iki yordamý birbirinden farklý kýlan, parametrelerin sýrasýdýr. 
 * 
 * Java dilinde dönüþtiplerine göre yordamlarýn ayýrt edilmesi kabul görmez; ayýrt edilmesini saðlayan tek þey parametrelerindeki farklýlýktýr.
 * 
 * */
 