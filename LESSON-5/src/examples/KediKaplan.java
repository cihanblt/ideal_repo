package examples;

class Kedi{
	protected int ayakSayisi=4;
	public void yakalaAv() {
		System.out.println("Kedi s�n�f� av yakalad�");
	}
	public static void main(String[] args) {
		Kedi kd=new Kedi();
		kd.yakalaAv();
	}
}
class Kaplan extends Kedi {

	public static void main(String[] args) {
		Kaplan kp=new Kaplan();
		kp.yakalaAv();
		System.out.println("Ayak say�s� = "+kp.ayakSayisi);
	}

}
