package examples;

public class ContinueTest {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5) { // For döngüsünü kýrýyor. 5 deðerini yazmýyacak
				continue;
			}
			System.out.println("i = " + i);
		}
		System.out.println("Döngüden çýktý");

	}

}
