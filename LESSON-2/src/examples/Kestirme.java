package examples;

public class Kestirme {

	public static boolean hesaplaBir(int a) {
		System.out.println("hesaplaBir yordamýna girildi");
		return a > 1;
	}

	public static boolean hesaplaIki(int a) {
		System.out.println("hesaplaIki yordamýna girildi");
		return a > 2;
	}

	public static void main(String[] args) {

		System.out.println("Baslangiç");
		// hesaplaBir(0) --> false deðer döner
		// hesaplaIki(3) --> true deðer döner

		System.out.println("hesaplaBir(0) && hesaplaIki(3)");
		if (hesaplaBir(0) && hesaplaIki(3)) {
			System.out.println("1 - true");
		} else {
			System.out.println("1 - false");
		}

		System.out.println("------------------------------");
		System.out.println("hesaplaBir(0) || hesaplaIki(3)");
		if (hesaplaBir(0) || hesaplaIki(3)) {
			System.out.println("2 - true");
		} else {
			System.out.println("2 - false");
		}

		System.out.println("------------------------------");
		System.out.println("hesaplaBir(0) & hesaplaIki(3)");
		if (hesaplaBir(0) & hesaplaIki(3)) {
			System.out.println("3 - true");
		} else {
			System.out.println("3 - false");
		}

		System.out.println("------------------------------");
		System.out.println("hesaplaBir(0) | hesaplaIki(3)");
		if (hesaplaBir(0) | hesaplaIki(3)) {
			System.out.println("4 - true");
		} else {
			System.out.println("4 - false");
		}

	}

}
