package examples;

public class FinalParametre {

	public static int topla(final int a, final int b) {
		// a = 5; !HATA!
		// b = 9; !HATA!
		return a + b;
	}

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Eksik veri girildi");
			System.exit(-1);
		}

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sonuc = topla(a, b);
		System.out.println("sonuc = " + sonuc);

	}

}
/*
D:\JAVA-IDE\workspace\LESSON-5\bin>java examples.FinalParametre 2 13
sonuc = 15
*/