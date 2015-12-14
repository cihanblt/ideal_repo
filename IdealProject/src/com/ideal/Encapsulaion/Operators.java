package com.ideal.Encapsulaion;

public class Operators {
//	public int a;
	public static String text;
	
	public static void main(String[] args) {
		// + - = / * ++ -- *= += /= *= %
		// && || < > <= >= != == 
		// & | 2^3
//		String letter = null;
//		System.out.println(letter);
		int x = 3;
		x *= 2 + 5;  // x = (x*2) + 5 invalid = 11
		// x *= 7 -> x = x * 7 = 21
//		System.out.println(x);
		int a , b = 0 , c = 0;
		a = b++ + ++c; //a = 1;
//		System.out.println(a); // 
//		System.out.println(b); 
		boolean bb = (100 < 99) || (++a == 1) || (++c != 1);
		boolean oc = (010 < 000) | (++b == 1);
		
//		System.out.println(bb);
//		System.out.println(" a= " +a);
//		System.out.println(" b= " +b);
//		System.out.println(" c= " +c);
		
		boolean eq = false == false;
		boolean eq1 = false != false;
		System.out.println(eq);
		System.out.println(eq1); 
		
		double mod = 10 % 3;
		System.out.println(mod);
		
		
	}
}
