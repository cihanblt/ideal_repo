package examples;

class Calisan {
	public void isYap(double a) {
		System.out.println("Calisan.isYap(" + a + ")");
	}
}

class Mudur extends Calisan {

	public void isYap(int a) { // Adaþ yordam (overloaded) !!!!
		System.out.println("Mudur.isYap(" + a + ")");
	}

	public static void main(String[] args) {
		Mudur m = new Mudur();
		m.isYap(3.3);
		m.isYap(3);
	}

}
