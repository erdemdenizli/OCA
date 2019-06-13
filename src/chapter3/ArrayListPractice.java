package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist1 = new ArrayList<>();
		
		arraylist1.add("abc");
		System.out.println(arraylist1.set(0, "1"));
		arraylist1.add("abab");
		arraylist1.add("adda");
		arraylist1.add("acba");
		
		System.out.println(arraylist1);
		
		ArrayList arraylist2 = new ArrayList<>();
		
		arraylist2.add("a");
		arraylist2.add("b");
		arraylist2.add("acaba");
		arraylist2.add("adadada");
		arraylist2.add("acbbac");
		
		arraylist2.remove("aad");//doesn't complain if it cannot find the element
		
		for(String string: arraylist1) {
			for(Object string2 : arraylist2) {
				if(string.equals(string2))
				System.out.println(string + " " + string2);
			}
		}
		
		
		
		List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        one.add("a");
        two.add("a");
        one.add("b");
        two.add(0, "b");
        System.out.println(one);
        System.out.println(two);
        Collections.sort(two);
        System.out.println(one.equals(two));
		
	}

}
