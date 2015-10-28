package com.ideal.Main;

public class Test extends Main{
	
	@Override
	public int getSomething() {
		System.out.println("getSometing in test class");
		return 0;
	}
	
	@Override
	public void met() {
		System.out.println("met mothod in test");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		Main main = new Test();
		main.met();
		main.getSomething();
	}

}

class ab{}