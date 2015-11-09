package tr.edu.kou.gerekli;

public class Musteri {
	public static void main(String[] args) {
		//Kahve kh=new Kahve();	//Hata!. Default yapýlandýrýcýsý private olduðu için instance oluþturulamaz
		//kh.kahveHazirla();		//Hata!
		//kh.siparis_sayisi=5;	//Hata!
		Kahve kh=Kahve.siparisGarson(6);
	}
}
