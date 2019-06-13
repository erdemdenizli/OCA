package chapter4;

//import static java.util.Arrays; // DOES NOT COMPILE
//import static java.util.Arrays.asList;
import static java.util.Arrays.*;

public class StaticImports {

	public static void main(String[] args) { 
	System.out.println(Arrays.asList("one")); // DOES NOT COMPILE
											  //because Arrays class is not imported
	} 										  // but it is fine to use just asList without Arrays

}