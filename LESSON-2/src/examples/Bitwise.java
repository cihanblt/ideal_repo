package examples;

public class Bitwise {

	public static void main(String[] args) {

		int a = 9; // 1001

		System.out.println("( a >> 1) --> " + (a >> 1));
		System.out.println("( a >> 2) --> " + (a >> 2));

		System.out.println("( a << 1) --> " + (a << 1));
		System.out.println("( a << 2) --> " + (a << 2));

		System.out.println("( a >>> 2) --> " + (a >>> 2));	// >>> i�aretsiz sa�a do�ru kayd�rma >> ile ayn�d�r. Fark� i�aretsiz olarak kayd�rma yapmas�d�r
	}

}
