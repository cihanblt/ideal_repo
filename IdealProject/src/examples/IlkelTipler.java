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
		System.out.println("Veri tipleri ilk deðerleri");
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
 * Java uygulamalarýnda üç tür deðiþken çeþidi bulunur: yerel
 * deðiþkenler,nesneye ait global alanlar ve son olarak sýnýfa ait global
 * alanlar(static alanlar). Yerel deðiþkenlere baþlangýþ deðerleri programcý
 * tarafýndan verilmelidir. Deðer verilmeden kullanýlamaya çalýþýlýrsa hata
 * oluþur. Nesnelere ait global alanlara ilk deðerleri programcýnýn vermesi
 * zorunlu deðildir.Java bu alanlara ilk deðerlerini kendiliðinden verir.
 */