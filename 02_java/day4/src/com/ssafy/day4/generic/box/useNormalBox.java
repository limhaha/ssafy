package com.ssafy.day4.generic.box;

public class useNormalBox {
	private static void useNormalBox
	{
		NormalBox nbox = new NormalBox();
		nbox.setSome("Hello");

		Object some = nbox.getSome();

		if (some instanceof String) {
			String str = (String) some;
			System.out.println("길이는" + str.length());
		}

	}
}
