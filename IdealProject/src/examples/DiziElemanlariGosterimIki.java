package examples;

public class DiziElemanlariGosterimIki {

	double[] d;
	String[] s;

	public DiziElemanlariGosterimIki() {
		d = new double[5];
		d[0] = 2.1;
		d[1] = 3.4;
		d[2] = 4.6;
		d[3] = 1.1;
		d[4] = 0.11;
		// d[5]=0.56; //Hata!

		s = new String[5];
		s[0] = new String("defter");
		s[1] = new String("kalem");
		s[2] = new String("sarman");
		s[3] = "tekir";
		s[4] = new String("boncuk");
		// s[5]=new String("duman"); //Hata!
	}

	public void ekranaBas() {
		for (int i = 0; i < d.length; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}
		System.out.println("------------------------");
		for (int i = 0; i < s.length; i++) {
			System.out.println("s[" + i + "] = " + s[i]);
		}
	}

	public static void main(String[] args) {
		new DiziElemanlariGosterimIki().ekranaBas();
	}

}
