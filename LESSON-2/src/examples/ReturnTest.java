package examples;

public class ReturnTest {

	public double toplamaYap(double a, double b) {
		double sonuc=a+b;
		return sonuc;	// Normal return kullanýmý
	}
	
	public void birseyYapma(double a) {
		if (a==0) {
			return;		// Yordamý acilen terk et
		} else {
			System.out.println("--> "+a);
		}
	}
	public static void main(String[] args) {
		

	}

}
