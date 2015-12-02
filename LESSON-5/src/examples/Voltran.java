package examples;

class Govde {
	void benzinTanklariniKontrolEt() {
	}
}

class SolBacak {
	void maviLazerSilahiAtesle() {
	}
}

class SagBacak {
	void kirmiziLazerSilahiAtesle() {
	}
}

class SagKol {
	void hedeHodoKalkaniCalistir() {
	}
}

class SolKol {
	void gucKaynagiKontrolEt() {
	}
}

class Kafa {
	void tumBirimlereUyariGonder() {
	}

	void dusmanTanimlamasiSistemiDevreyeSok() {
	}
}

public class Voltran {

	Govde gv = new Govde();
	SolBacak slb = new SolBacak();
	SagBacak sgb = new SagBacak();
	SagKol sgk = new SagKol();
	SolKol slk = new SolKol();
	Kafa kf = new Kafa();

	public static void main(String[] args) {

		Voltran vr = new Voltran();
		vr.kf.dusmanTanimlamasiSistemiDevreyeSok();
		vr.kf.tumBirimlereUyariGonder();
		vr.sgb.kirmiziLazerSilahiAtesle();
	}

}
