package examples;

public class IlkelTiplerStatik {

	static boolean mantiksal_deger;
	static char karakter_deger;
	static byte byte_deger;
	static short short_deger;
	static int int_deger;
	static long long_deger;
	static float float_deger;
	static double double_deger;

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
		new IlkelTiplerStatik().ekranaBas();

	}

}

/*
 * S�n�flara ait global alanlara (static alanlar) de�er atamakla nesnelere ait
 * global alanlara de�er atamak aras�nda bir fark yoktur.Buradki �nemli nokta
 * statik alanlara�n ortak olmas�d�r.
 */