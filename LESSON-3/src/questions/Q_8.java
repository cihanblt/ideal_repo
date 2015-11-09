/*
 * Static global alanlarýn, sýnýfa ilk ulaþtýðýnda ilk deðerlerinin hemen verildiðini
 * ispatlayan bir uygulama yazýnýz.Uygulama main() yordamý üzerinden sýnanabilir olamalýdýr.
 */
package questions;

public class Q_8 {

	public static boolean boolean_degisken() {
		System.out.println("boolean static deðiþken deðer atandý");
		return true;
	}

	public static int int_degisken() {
		System.out.println("int static deðiþken deðer atandý");
		return 26;
	}

	public static String string_degisken() {
		System.out.println("string static deðiþken deðer atandý");
		return "Hasan BOZACIOÐLU";
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
