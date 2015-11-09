package examples;

class Dinosor{
	public Dinosor() {
		System.out.println("Ben Denver");
	}
}

public class NonStaticTopluDegerAtama {

	int x;
	double y;
	Dinosor dz;
	{
		x=5;
		y=6.89;
		dz=new Dinosor();
	}
	
	public static void main(String[] args) {
		NonStaticTopluDegerAtama ex= new NonStaticTopluDegerAtama();
		System.out.println("x -> "+ex.x);
		System.out.println("y -> "+ex.y);
		System.out.println("dz -> "+ex.dz);
		
	}

}
