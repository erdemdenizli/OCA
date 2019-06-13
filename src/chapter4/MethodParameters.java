package chapter4;

public class MethodParameters {
	public static void main(String[] args) {
		int number = 1;
		String letters = "abc";
		System.out.println(number(number));
		letters = letters(letters);
		System.out.println(number + letters);
	}

	public static int number(int number) {
		number++;
		return number;
	}
	
	public static void number(int number) {
		System.out.println("same parameters won't overload");
	}

	public static String letters(String letters) {
		letters += "d";
		return letters;
	}
}
