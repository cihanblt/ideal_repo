package examples;

public class IlkelTipler {

	boolean mantiksal_deger;
	char karakter_deger;
	byte byte_deger;
	short short_deger;
	int int_deger;
	long long_deger;
	float float_deger;
	double double_deger;

	public void ekranaBas() {
		System.out.println("Veri tipleri ilk de�erleri");
		System.out.println("boolean -> " + mantiksal_deger);
		System.out.println("char -> " + karakter_deger);
		System.out.println("byte -> " + byte_deger);
		System.out.println("short -> " + short_deger);
		System.out.println("int -> " + int_deger);
		System.out.println("long -> " + long_deger);
		System.out.println("float -> " + float_deger);
		System.out.println("double -> " + double_deger);
	}

	public static void main(String[] args) {

		new IlkelTipler().ekranaBas();

	}

}

/*
 * Java uygulamalar�nda �� t�r de�i�ken �e�idi bulunur: yerel
 * de�i�kenler,nesneye ait global alanlar ve son olarak s�n�fa ait global
 * alanlar(static alanlar). Yerel de�i�kenlere ba�lang�� de�erleri programc�
 * taraf�ndan verilmelidir. De�er verilmeden kullan�lamaya �al���l�rsa hata
 * olu�ur. Nesnelere ait global alanlara ilk de�erleri programc�n�n vermesi
 * zorunlu de�ildir.Java bu alanlara ilk de�erlerini kendili�inden verir.
 */