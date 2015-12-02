package examples;

public class ContinueTestEtiketli {

	public static void main(String[] args) {

		pas: for (int j = 0; j < 6; j++) {
			System.out.println("---------");
			for (int i = 0; i < 5; i++) {
				if (i == 3) { // For döngüsünü kýrýyor
					continue pas;
				}
				System.out.println("i = " + i);
			}
			System.out.println("Döngüden çýktý.");
			System.out.println("j = " + j);
		}

	}

}
