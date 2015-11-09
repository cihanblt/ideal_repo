package examples;

abstract class Cizim {
	// abstract method
	public abstract void noktaCiz(int x, int y);

	public void cigiCiz(int x1, int y1, int x2, int y2) {
		// noktaCiz(x, y); //Yordamýný kullanarak ekrana çizgi çiz
	}
}

class CepTelefonuCizim extends Cizim {
	@Override
	public void noktaCiz(int x, int y) {
		// Ceptelefonu ekraný için nokta çiz
	}
}

class MonitorCizim extends Cizim {
	@Override
	public void noktaCiz(int x, int y) {
		// Monitor ekraný için nokta çiz
	}
}

public class CizimProgrami {

	public void baslat(int x1, int y1, int x2, int y2) {
		Cizim c1 = new CepTelefonuCizim();// Upcasting
		c1.cigiCiz(x1, y1, x2, y2);
		Cizim c2 = new MonitorCizim();// Upcasting
		c2.cigiCiz(x1, y1, x2, y2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
