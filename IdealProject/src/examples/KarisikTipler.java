package examples;

public class KarisikTipler {

	boolean mantiksal_deger = mantiksalDegerAta();// Do�ru de�erini al�r
	static int int_deger = intDegerAta();// 10 de�erini al�r
	String s;
	double d = 1.47;

	public boolean mantiksalDegerAta() {
		return true;
	}

	public static int intDegerAta() {
		return 5 * 2;
	}

	public void tipYaz() {
		System.out.println("mantiksal_deger -> " + mantiksal_deger);
		System.out.println("int_deger -> " + int_deger);
		System.out.println("s -> " + s);
		System.out.println("d -> " + d);
	}

	public static void main(String[] args) {
		new KarisikTipler().tipYaz();
	}

}

/*
 * Dikkat edilirse, static olan int deger alan�na ba�lang�� de�eri static bir
 * yordam taraf�ndan verilmektedir.
 */