package examples;

public class Bitwise {

	public static void main(String[] args) {

		int a = 9; // 1001

		System.out.println("( a >> 1) --> " + (a >> 1));
		System.out.println("( a >> 2) --> " + (a >> 2));

		System.out.println("( a << 1) --> " + (a << 1));
		System.out.println("( a << 2) --> " + (a << 2));

		System.out.println("( a >>> 2) --> " + (a >>> 2));	// >>> işaretsiz sağa doğru kaydırma >> ile aynıdır. Farkı işaretsiz olarak kaydırma yapmasıdır
	}

}
