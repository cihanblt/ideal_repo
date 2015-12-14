package com.ideal.Semih;

public class C1 extends AbstractA {
	protected static int count;
	@Override
	public int prepareCount() {
		return ++count;
	}
}
