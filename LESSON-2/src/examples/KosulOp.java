package examples;

public class KosulOp {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;
		int c = 6;
		int d = 1;
		
		/*
		 * ( a < b ) = true
		 * ( c < d ) = false
		 * */

		System.out.println("(a < b) && (c < d) --> " + ((a < b) && (c < d)));
		System.out.println("(a < b) || (c < d) --> " + ((a < b) || (c < d)));
		System.out.println("! (a < b) --> " + (!(a < b)) );
		System.out.println("(a < b) & (c < d) --> " + ((a < b) & (c < d)));
		System.out.println("(a < b) | (c < d) --> " + ((a < b) | (c < d)));
		System.out.println("(a < b) ^ (c < d) --> " + ((a < b) ^ (c < d)));

	}

}
