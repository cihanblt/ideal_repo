package examples;

public class IlkelPas {

	static void f(double a){
		System.out.println(a+" g�nderildi");
		a=10;
		System.out.println("g�nderilen parametrenin de�eri 10'a e�itlendi");
	}
	
	public static void main(String[] args) {
		
		double a=5;
		f(a);
		System.out.println("a --> "+a);

	}

}
