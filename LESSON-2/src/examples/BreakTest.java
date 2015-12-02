package examples;

public class BreakTest {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			if (i == 9) { // For döngüsünü kýrýyor.
				break;
			}
			System.out.println("i = " + i);
		}
		System.out.println("Döngüden çýktý.");
	}

}
