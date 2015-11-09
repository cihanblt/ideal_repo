package examples;

class Packet{
	int i=0;
	public Packet(int i) {
		this.i=i;
		System.out.println("Yer kaplamak için");
	}
	protected void finalize(){
		System.out.println("Packet deleted");
	}
}

public class HeapGosterim {

	public static void main(String[] args) {
		for (int y = 0; y < 100000; y++) {
			new Packet(y);
			if ((y % 10000) == 0) {
				System.gc();
			}
		}

	}

}
