package examples;

public class Tost {
	int sayi;
	String malzeme;

	public Tost() {
		this(5);
		// this(5,"sucuklu"); // Hata! iki this kullan�lamaz.
		System.out.println("parametresiz yapilandirici");
	}

	public Tost(int sayi) {
		this(sayi, "sucuklu"); // Ba�ka bir yap�land�r�c� �a��r�lacaksa,
								// yap�land�r�c� yordam�n ilk sat�r�nda
								// �a��r�lmal�
		this.sayi = sayi;
		System.out.println("Tost ( int sayi )");
	}

	public Tost(int sayi, String malzeme) {
		this.sayi = sayi;
		this.malzeme = malzeme;
		System.out.println("Tost ( int sayi, String malzeme)");
	}

	public void siparisGoster() {
		// this(5,"Kasarli"); // Hata! sadece yap�land�r�c�larda kullan�l�r.
		System.out.println("Tost sayisi = " + sayi + ", malzeme = " + malzeme);
	}

	public static void main(String[] args) {

		Tost t = new Tost();
		t.siparisGoster();

	}

}

/*
 * Bir yap�land�r�c� this ifadesi ile di�er bir yap�land�r�c�y� �a��r�rken dikkat edilmesi gereken kurallar a�a��daki gibidir:
 * Yap�land�r�c�lar i�erisinde this ifadesi ile herzaman ba�ka bir yap�land�r�c� �a�r�labilir.
 * Yap�lan�r�c� i�erisinden, di�er yap�ladn�r�c�y� �a��r�rken this ifadesi her zaman ilk sat�rda yaz�lmal�d�r.
 * Yap�land�r�c�lar i�erisinde birden fazla this ifadesi ile ba�ka yap�land�r�c� �a�r�lamaz.
 * 
 * ��kt� :
Tost ( int sayi, String malzeme)
Tost ( int sayi )
parametresiz yapilandirici
Tost sayisi = 5, malzeme = sucuklu
 * 
 */