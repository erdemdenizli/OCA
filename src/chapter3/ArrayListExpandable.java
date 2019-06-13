package chapter3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExpandable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> museums = new ArrayList<>(1);
		System.out.println(museums);
		System.out.println(museums.get(0));
		museums.add("Natural History");
		museums.add("Science");
		museums.add("Art");
		//museums.remove(2);
		System.out.println(museums.size());
		System.out.println(museums);
		
	}

}
