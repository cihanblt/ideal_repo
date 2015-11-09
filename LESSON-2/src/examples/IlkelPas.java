package examples;

public class IlkelPas {

	static void f(double a){
		System.out.println(a+" gönderildi");
		a=10;
		System.out.println("gönderilen parametrenin deðeri 10'a eþitlendi");
	}
	
	public static void main(String[] args) {
		
		double a=5;
		f(a);
		System.out.println("a --> "+a);

	}

}
