package examples;

public class HayvanlarAlemi {

	String[][][] isimler;

	public HayvanlarAlemi() {
		isimler = new String[2][2][3];
		veriAta();
	}

	public void veriAta() {
		isimler[0][0][0] = "Aslan";
		isimler[0][0][1] = "Boz Ayý";
		isimler[0][0][2] = "Ceylan";

		isimler[0][1][0] = "Deniz Anasý";
		isimler[0][1][1] = "Eþþek";
		isimler[0][1][2] = "Fare";

		isimler[1][0][0] = "Geyik";
		isimler[1][0][1] = "smsi";
		isimler[1][0][2] = "Ýnek";

		isimler[1][1][0] = "Japon Balýðý";
		isimler[1][1][1] = "Kedi";
		isimler[1][1][2] = "Lama";

		ekranaBas(isimler);
	}

	public void ekranaBas(String[][][] s) {
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				for (int k = 0; k < s[i][j].length; k++) {
					System.out.println("[" + i + "][" + j + "][" + k + "] = " + s[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new HayvanlarAlemi();

	}

}
