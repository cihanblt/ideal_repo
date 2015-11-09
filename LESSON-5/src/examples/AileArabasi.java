package examples;

public class AileArabasi {

	private Motor m = new Motor();

	public void hareketEt() {
		m.calis();
		System.out.println("Aile arabasý çalýþtý");
	}

	public void dur() {
		m.dur();
		System.out.println("Aile arabasý durdu");
	}

	public static void main(String[] args) {
		AileArabasi aa = new AileArabasi();
		aa.hareketEt();
		aa.dur();
	}

}
