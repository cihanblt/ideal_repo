package examples;

public class IliskiselDeneme {

	public static void main(String[] args) {

		// Deðiþken bildirimleri

		int i = 37, j = 42, k = 42;

		System.out.println("Deðiþken deðerleri...");
		System.out.println(" i = " + i);
		System.out.println(" j = " + j);
		System.out.println(" k = " + k);

		// Büyük mü?
		
		System.out.println("Büyüktür...");
		System.out.println(" i > j = " + (i > j));
		System.out.println(" j > i = " + (j > i));
		System.out.println(" k > j = " + (k > j));

		// Büyük veya eþit mi?

		System.out.println("Büyüktür veya eþittir...");
		System.out.println(" i >= j = " + (i >= j));
		System.out.println(" j >= i = " + (j >= i));
		System.out.println(" k >= j = " + (k >= j));
		
		// Küçük mü?

		System.out.println("Küçüktür...");
		System.out.println(" i < j = " + (i < j));
		System.out.println(" j < i = " + (j < i));
		System.out.println(" k < j = " + (k < j));
		
		// Küçük veya eþit mi?

		System.out.println("Küçüktür veya eþittir...");
		System.out.println(" i <= j = " + (i <= j));
		System.out.println(" j <= i = " + (j <= i));
		System.out.println(" k <= j = " + (k <= j));
		
		// Eþit mi?

		System.out.println("Eþittir...");
		System.out.println(" i == j = " + (i == j));
		System.out.println(" k == j = " + (k == j));
		
		// Eþit deðil mi?

		System.out.println("Eþit deðil...");
		System.out.println(" i != j = " + (i != j));
		System.out.println(" k != j = " + (k != j));
	}

}
