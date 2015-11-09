package examples;

class Xmodel {
	public void sesAc() {
		System.out.println("Xmodel televizyon sesAc()");
	}

	public void sesKapa() {
		System.out.println("Xmodel televizyon sesKapa()");
	}

	public void kanalDegistir() {
		System.out.println("Xmodel televizyon KanalDegistir()");
	}
}

class Ymodel extends Xmodel {
	@Override
	public void sesAc() {
		System.out.println("Ymodel televizyon sesAc()");
	}

	@Override
	public void sesKapa() {
		System.out.println("Ymodel televizyon sesKapa()");
	}

	@Override
	public void kanalDegistir() {
		System.out.println("Ymodel televizyon KanalDegistir()");
	}

	public void teleText() {
		System.out.println("Ymodel televizyon teleText()");
	}
}

public class Televizyon {

	public static void main(String[] args) {
		Xmodel x_model_kumanda = new Ymodel();// Upcasting
		x_model_kumanda.sesAc();
		x_model_kumanda.sesKapa();
		x_model_kumanda.kanalDegistir();
		// x_model_kumanda.teleText(); //Hata bu kumandanýn böyle bir düðmesi
		// yok

		Ymodel y_model_kumanda = (Ymodel) x_model_kumanda;// Downcasting
		y_model_kumanda.teleText();

		System.out.println();
		System.out.println("x_model_kumanda = " + x_model_kumanda);
		System.out.println("y_model_kumanda = " + y_model_kumanda);
	}

}
