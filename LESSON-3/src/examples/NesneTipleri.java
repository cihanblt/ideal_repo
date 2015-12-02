package examples;

public class NesneTipleri {
	String s;

	public static void main(String[] args) {
		NesneTipleri nt = new NesneTipleri();
		System.out.println("s = " + nt.s);
		// nt.s=nt.s.trim(); //Hata

	}

}
/*
 * Aksi belirtilmediði sürece nesnelere ait global alanlara, herhangi bir sýnýf
 * tipinde olmasý durumunda, baþlangýç deðeri olarak "null" atanýr; yani boþ
 * deðer...Eðer bu alanlar bu içeriðiyle kullanýlmaya kalkýþýlýrsa, çalýþma
 * anýnda hata ile karþýlaþýlýr.Hata ile karþýlaþmamk için ilgili alanlarý uygun
 * bir nesnelere baðlamak gerekir.
 */