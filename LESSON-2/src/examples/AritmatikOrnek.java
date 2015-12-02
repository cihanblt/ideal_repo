package examples;

public class AritmatikOrnek {

	public static void main(String[] args) {

		// Deðiþkenlere atanan deðerler
		int a=57, b=42;
		double c=27.475, d=7.22;
		
		System.out.println("Deðiþken deðerleri");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		// Sayýlarý topluyoruz
		
		System.out.println("Toplama...");
		System.out.println("a + b = "+(a+b));
		System.out.println("c + d = "+(c+d));

		// Sayýlarý çýkartýyoruz
		
		System.out.println("Çýkartma...");
		System.out.println("a - b = "+(a-b));
		System.out.println("c - d = "+(c-d));
		
		// Sayýlarý çarpýyoruz
		
		System.out.println("Çarpma...");
		System.out.println("a * b = "+(a*b));
		System.out.println("c * d = "+(c*d));
		
		// Sayýlarý bölüyoruz
		
		System.out.println("Bölme...");
		System.out.println("a / b = "+(a/b));
		System.out.println("c / d = "+(c/d));
		
		// Bölme iþleminden kalan sayýyý hesaplýyoruz

		System.out.println("Kalan sayýyý hesaplama MOD...");
		System.out.println("a % b = "+(a%b));
		System.out.println("c % d = "+(c%d));
		
		// double ve int türlerini karþýk þekilde kullanyoruz
		
		System.out.println("Karýþýk türler...");
		System.out.println("b + d = "+(b+d));
		System.out.println("a * c = "+(a*c));
	}

}
