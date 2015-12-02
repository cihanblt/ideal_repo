package examples;

class Bocek {
	int a = 10;
	int b;

	public Bocek() {
		ekranaBas("a = " + a + ", b = " + b);
		b = 17;
	}

	static int x1 = ekranaBas("static Bocek.x1 ilk deðeri verildi");

	static int ekranaBas(String s) {
		System.out.println(s);
		return 18;
	}
}

public class Bocekcik extends Bocek {

	int k = ekranaBas("Bocekcik.k ilk deðeri verildi");

	public Bocekcik() {
		ekranaBas("k = " + k);
		ekranaBas("b = " + b);
	}

	static int x2 = ekranaBas("static Bocekcik.x2 ilk deðeri verildi");

	public static void main(String[] args) {
		ekranaBas("Bocekcik - basla..");
		Bocekcik b = new Bocekcik();
	}

}
