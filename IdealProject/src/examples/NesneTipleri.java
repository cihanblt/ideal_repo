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
 * Aksi belirtilmedi�i s�rece nesnelere ait global alanlara, herhangi bir s�n�f
 * tipinde olmas� durumunda, ba�lang�� de�eri olarak "null" atan�r; yani bo�
 * de�er...E�er bu alanlar bu i�eri�iyle kullan�lmaya kalk���l�rsa, �al��ma
 * an�nda hata ile kar��la��l�r.Hata ile kar��la�mamk i�in ilgili alanlar� uygun
 * bir nesnelere ba�lamak gerekir.
 */