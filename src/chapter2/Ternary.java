package chapter2;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String game;
		int toy = 5;
		int age = 2;
		
		if(toy<2) {
			game = age > 1 ? 1:10; //
		} else {
			game = age > 3 ? "Ball" : " Swim";
		}

	}

}
