package examples;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
		int[][] ikiboy = new int[3][];
		ikiboy[0] = new int[2];
		ikiboy[1] = new int[1];
		ikiboy[2] = new int[3];

		ikiboy[0][0] = 1;
		ikiboy[0][1] = 1;

		ikiboy[1][0] = 0;

		ikiboy[2][0] = 0;
		ikiboy[2][1] = 1;
		ikiboy[2][2] = 2;

		for (int i = 0; i < ikiboy.length; i++) {
			for (int j = 0; j < ikiboy[i].length; j++) {
				// System.out.println("ikiboy[" + i + "][" + j + "] = " + ikiboy[i][j]);
				System.out.print(ikiboy[i][j] + " ");
			}
			System.out.println();
		}
	}

}
/*
 * Dizilere baðlý diðer dizilerin ayný uzunlukta olma zorunluluðu yoktur
 */