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
 * Aksi belirtilmedi�i s�rece, s�n�flara ait global alanlar, herhangi bir s�n�f
 * tipinde olmas� durumunda, bu alana ba�lang�� de�eri olarak "null" atan�r.
 */