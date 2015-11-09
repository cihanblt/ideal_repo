package examples;

public class BitwiseOrnek2 {

	public static void main(String[] args) {

		int a = 10; // 1010
		int b = 9; //  1001
		int c = 8; //  1000

		System.out.println(" ( a & b) --> " + (a & b));
		System.out.println(" ( a | b) --> " + (a | b));
		System.out.println(" ( a ^ b) --> " + (a ^ b));
		
		System.out.println(" ( ~a ) --> " + (~a));
		System.out.println(" ( ~b) --> " + (~b));
		System.out.println(" ( ~c) --> " + (~c));
	}

}
