package examples;

public class ContinueTest {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5) { // For d�ng�s�n� k�r�yor. 5 de�erini yazm�yacak
				continue;
			}
			System.out.println("i = " + i);
		}
		System.out.println("D�ng�den ��kt�");

	}

}
