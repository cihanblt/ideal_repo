package examples;

public class BreakTestEtiketli {

	public static void main(String[] args) {

		kiril: for (int j = 0; j < 10; j++) {

			for (int i = 0; i < 100; i++) {

				if (i == 9) { // For d�ng�s�n� k�r�yor.
					break kiril;
				}
				System.out.println("i = " + i);

			}

			System.out.println("D�ng�den ��kt�");
			System.out.println("j = " + j);
		}

	}

}
