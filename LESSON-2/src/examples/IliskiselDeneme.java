package examples;

public class IliskiselDeneme {

	public static void main(String[] args) {

		// De�i�ken bildirimleri

		int i = 37, j = 42, k = 42;

		System.out.println("De�i�ken de�erleri...");
		System.out.println(" i = " + i);
		System.out.println(" j = " + j);
		System.out.println(" k = " + k);

		// B�y�k m�?
		
		System.out.println("B�y�kt�r...");
		System.out.println(" i > j = " + (i > j));
		System.out.println(" j > i = " + (j > i));
		System.out.println(" k > j = " + (k > j));

		// B�y�k veya e�it mi?

		System.out.println("B�y�kt�r veya e�ittir...");
		System.out.println(" i >= j = " + (i >= j));
		System.out.println(" j >= i = " + (j >= i));
		System.out.println(" k >= j = " + (k >= j));
		
		// K���k m�?

		System.out.println("K���kt�r...");
		System.out.println(" i < j = " + (i < j));
		System.out.println(" j < i = " + (j < i));
		System.out.println(" k < j = " + (k < j));
		
		// K���k veya e�it mi?

		System.out.println("K���kt�r veya e�ittir...");
		System.out.println(" i <= j = " + (i <= j));
		System.out.println(" j <= i = " + (j <= i));
		System.out.println(" k <= j = " + (k <= j));
		
		// E�it mi?

		System.out.println("E�ittir...");
		System.out.println(" i == j = " + (i == j));
		System.out.println(" k == j = " + (k == j));
		
		// E�it de�il mi?

		System.out.println("E�it de�il...");
		System.out.println(" i != j = " + (i != j));
		System.out.println(" k != j = " + (k != j));
	}

}
