package chapter3;

import java.util.Arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] intArray = new int[3][];
		
		intArray[0] = new int[5];
		intArray[1] = new int[2];
		
		System.out.println(intArray[0].length);
		System.out.println(intArray[1].length);
		//System.out.println(intArray[2].length);
		
		
		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
		for (int j = 0; j < twoD[i].length; j++) System.out.print(twoD[i][j] + " "); // print element
		System.out.println(); // time for a new row }
		}
		
		//for each of above
		for (int[] inner : twoD) { 
			for (int num : inner)
				System.out.print(num + " "); 
			System.out.println();
			
		}

	}

}
