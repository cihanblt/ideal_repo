package examples;

public class Yumurta {

	int toplam_yumurta_sayisi = 0;
	int koli = 10;

	Yumurta sepeteKoy() {
		toplam_yumurta_sayisi++;
		koli--;
		return this;//Nesneye ait referans deðer döndürür.
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
 * Bir yordamýn içerisinde diðer yordamý çaðýrmak gayet basit ve açýktýr ama sahne 
 * arkasýnda derleyici, çaðrýlan bu yardamýn önüne this anahtar kelimesini gizlice
 * yerleþtirir: yani fazladan this.sec() denilmesinin fazla bir anlamý yoktur. 
 * 
 * sepeteKoy() yordamý Yumurta sýnýfý tipinde deðer geri döndürmektedir. return
 * this diyerek, oluþturulmuþ olan Yumurta nesnesinin kendisine ait bir referans geri
 * döndürülmektedir.sepetekoy() yordamý her çaðýrýldýðýnda Yumurta nesnesine ait,
 * toplam_yumurta_sayisi global alanýnýn deðeri bir artmaktadýr.Burada dikkat 
 * edilmesi gereken husus this anahtar kelimesi ancak nesnelere ait global yordamlar
 * içerisinde kullanýlabilir.
 * 
 */