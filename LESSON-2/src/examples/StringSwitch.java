package examples;

public class StringSwitch {

	public static void main(String[] args) {

		String secilen = "Taksim";

		switch (secilen) {

		case "Taksim":
			System.out.println(secilen + " se�ildi");
			break;
		case "Eminonu":
			System.out.println(secilen + " se�ildi");
			break;
		case "Kadikoy":
			System.out.println(secilen + " se�ildi");
			break;
		default:
			System.out.println(secilen + "belirsiz");
			break;
		}

	}

}
