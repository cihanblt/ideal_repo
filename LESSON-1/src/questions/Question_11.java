package questions;

public class Question_11 {

	public void paramYaz(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}
	
	public static void main(String[] args) {

		Question_11 q=new Question_11();
		String[] params={"1","2","3"};
		q.paramYaz(params);

	}

}
