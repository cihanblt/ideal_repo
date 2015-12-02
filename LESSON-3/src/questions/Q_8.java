/*
 * Static global alanlar�n, s�n�fa ilk ula�t���nda ilk de�erlerinin hemen verildi�ini
 * ispatlayan bir uygulama yaz�n�z.Uygulama main() yordam� �zerinden s�nanabilir olamal�d�r.
 */
package questions;

public class Q_8 {

	public static boolean boolean_degisken() {
		System.out.println("boolean static de�i�ken de�er atand�");
		return true;
	}

	public static int int_degisken() {
		System.out.println("int static de�i�ken de�er atand�");
		return 26;
	}

	public static String string_degisken() {
		System.out.println("string static de�i�ken de�er atand�");
		return "Hasan BOZACIO�LU";
	}

	static boolean deg_1 = boolean_degisken();
	static int deg_2 = int_degisken();
	static String deg_3 = string_degisken();

	public static void main(String[] args) {

		System.out.println();
		System.out.println(deg_1);
		System.out.println(deg_2);
		System.out.println(deg_3);
		

	}

}
