package chapter4;

import static chapter4_2.Whatever.*;

public class Whatever2 {

	{
		number = 10;
	}

	public void randomMethod() {
		number = 11;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number = 10;

		System.out.println(number);

		Whatever2 wht = new Whatever2();
		wht.randomMethod();
		System.out.println(number);
	}

}
