package examples;

public class Tost {
	int sayi;
	String malzeme;

	public Tost() {
		this(5);
		// this(5,"sucuklu"); // Hata! iki this kullanýlamaz.
		System.out.println("parametresiz yapilandirici");
	}

	public Tost(int sayi) {
		this(sayi, "sucuklu"); // Baþka bir yapýlandýrýcý çaðýrýlacaksa,
								// yapýlandýrýcý yordamýn ilk satýrýnda
								// çaðýrýlmalý
		this.sayi = sayi;
		System.out.println("Tost ( int sayi )");
	}

	public Tost(int sayi, String malzeme) {
		this.sayi = sayi;
		this.malzeme = malzeme;
		System.out.println("Tost ( int sayi, String malzeme)");
	}

	public void siparisGoster() {
		// this(5,"Kasarli"); // Hata! sadece yapýlandýrýcýlarda kullanýlýr.
		System.out.println("Tost sayisi = " + sayi + ", malzeme = " + malzeme);
	}

	public static void main(String[] args) {

		Tost t = new Tost();
		t.siparisGoster();

	}

}

/*
 * Bir yapýlandýrýcý this ifadesi ile diðer bir yapýlandýrýcýyý çaðýrýrken dikkat edilmesi gereken kurallar aþaðýdaki gibidir:
 * Yapýlandýrýcýlar içerisinde this ifadesi ile herzaman baþka bir yapýlandýrýcý çaðrýlabilir.
 * Yapýlanýrýcý içerisinden, diðer yapýladnýrýcýyý çaðýrýrken this ifadesi her zaman ilk satýrda yazýlmalýdýr.
 * Yapýlandýrýcýlar içerisinde birden fazla this ifadesi ile baþka yapýlandýrýcý çaðrýlamaz.
 * 
 * Çýktý :
Tost ( int sayi, String malzeme)
Tost ( int sayi )
parametresiz yapilandirici
Tost sayisi = 5, malzeme = sucuklu
 * 
 */