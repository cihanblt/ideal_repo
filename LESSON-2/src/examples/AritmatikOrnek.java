package examples;

public class AritmatikOrnek {

	public static void main(String[] args) {

		// De�i�kenlere atanan de�erler
		int a=57, b=42;
		double c=27.475, d=7.22;
		
		System.out.println("De�i�ken de�erleri");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		// Say�lar� topluyoruz
		
		System.out.println("Toplama...");
		System.out.println("a + b = "+(a+b));
		System.out.println("c + d = "+(c+d));

		// Say�lar� ��kart�yoruz
		
		System.out.println("��kartma...");
		System.out.println("a - b = "+(a-b));
		System.out.println("c - d = "+(c-d));
		
		// Say�lar� �arp�yoruz
		
		System.out.println("�arpma...");
		System.out.println("a * b = "+(a*b));
		System.out.println("c * d = "+(c*d));
		
		// Say�lar� b�l�yoruz
		
		System.out.println("B�lme...");
		System.out.println("a / b = "+(a/b));
		System.out.println("c / d = "+(c/d));
		
		// B�lme i�leminden kalan say�y� hesapl�yoruz

		System.out.println("Kalan say�y� hesaplama MOD...");
		System.out.println("a % b = "+(a%b));
		System.out.println("c % d = "+(c%d));
		
		// double ve int t�rlerini kar��k �ekilde kullanyoruz
		
		System.out.println("Kar���k t�rler...");
		System.out.println("b + d = "+(b+d));
		System.out.println("a * c = "+(a*c));
	}

}
