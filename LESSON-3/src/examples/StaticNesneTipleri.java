package examples;

public class StaticNesneTipleri {
	static String s;

	public static void main(String[] args) {
		StaticNesneTipleri snt = new StaticNesneTipleri();
		System.out.println("s = " + snt.s);
		// snt.s=snt.s.trim(); //hata!
	}

}
/*
 * Aksi belirtilmediði sürece, sýnýflara ait global alanlar, herhangi bir sýnýf
 * tipinde olmasý durumunda, bu alana baþlangýç deðeri olarak "null" atanýr.
 */