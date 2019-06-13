package chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseASentenceByArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		List<String> str = Arrays.asList(sentence.split(" "));
		
		for(int i=str.size()-1; i>=0; i-- ) {
			System.out.print(str.get(i));
			if(i!=0) {
				System.out.print(" ");
			}
		}

	}

}
