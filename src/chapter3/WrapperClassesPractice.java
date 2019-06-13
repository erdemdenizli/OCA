package chapter3;

public class WrapperClassesPractice {
	
	public static void main(String[] args) {
		
		Short short1 = new Short((short)1);
		//Short short1 = new Short(1);
		
		int primitive = Integer.parseInt("123");
		Integer wrapper = Integer.valueOf("123");
		
		//int bad1 = Integer.parseInt("a"); // throws NumberFormatException 
		//Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException

		char x = 65535;
		System.out.println(x);
		
		Boolean bool = Boolean.valueOf("TrUe");
		System.out.println(bool);
		
		int int1 = new Integer("12");
		int int2 = new Integer(12);
		System.out.println(int1==int2);
		
		//int int3 = new Integer("12.12"); // throws exception
		//System.out.println(int3);
		
		double db1 = new Double("12");
		System.out.println(db1);
		
		boolean bool2 = new Boolean("true");
		System.out.println(bool2);
		
		char c1 = new Character(a);//doesn't compile
		char c2 = new Character("a");//doesn't compile
		char c3 = new Character('a');
	}

}
