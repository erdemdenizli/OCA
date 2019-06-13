package chapter4;

public class StaticInitializer {
	private static int one;
	private static final int two;
	private static final int three = 3;
	private final static int four;// doesn't compile because static initializer
	static { 					  // doesn't have this to initialize
		one = 1;
		two = 2;
		three = 3;
		two = 4;
	}
	{
		four = 4; // would have worked if four was static or final only
	} 

	public void hello() {
		System.out.println("more hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInitializer obj = new StaticInitializer();
		// System.out.println(obj.name);
		obj.hello();
		System.out.println(four);

	}

}
