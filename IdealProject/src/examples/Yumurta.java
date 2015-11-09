package examples;

public class Yumurta {

	int toplam_yumurta_sayisi = 0;
	int koli = 10;

	Yumurta sepeteKoy() {
		toplam_yumurta_sayisi++;
		koli--;
		return this;//Nesneye ait referans de�er d�nd�r�r.
	}

	void goster() {
		System.out.println("toplam_yumurta_sayisi = " + toplam_yumurta_sayisi + ", koli = " + koli);
	}

	public static void main(String[] args) {
		Yumurta y = new Yumurta();
		y.sepeteKoy().sepeteKoy().sepeteKoy().goster();

	}

}

/*
 * Bir yordam�n i�erisinde di�er yordam� �a��rmak gayet basit ve a��kt�r ama sahne 
 * arkas�nda derleyici, �a�r�lan bu yardam�n �n�ne this anahtar kelimesini gizlice
 * yerle�tirir: yani fazladan this.sec() denilmesinin fazla bir anlam� yoktur. 
 * 
 * sepeteKoy() yordam� Yumurta s�n�f� tipinde de�er geri d�nd�rmektedir. return
 * this diyerek, olu�turulmu� olan Yumurta nesnesinin kendisine ait bir referans geri
 * d�nd�r�lmektedir.sepetekoy() yordam� her �a��r�ld���nda Yumurta nesnesine ait,
 * toplam_yumurta_sayisi global alan�n�n de�eri bir artmaktad�r.Burada dikkat 
 * edilmesi gereken husus this anahtar kelimesi ancak nesnelere ait global yordamlar
 * i�erisinde kullan�labilir.
 * 
 */