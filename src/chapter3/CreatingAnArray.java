package chapter3;

import java.util.Arrays;

public class CreatingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {7,12};
		int[] arr4 = {1,2,3,4,5,6};
		
		arr4[3] = 100;
		
		for(int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i]);
		}
		
		System.out.println("");
		
		System.out.print(Arrays.toString(arr4)); //special method for printing arrays
		
		System.out.println("");
		
		System.out.println(arr4);
		
		
		int[] arr3 = new int[5];
		arr3[0] = 2;
		
		
		int[] arr2 = new int[5] {1,2,7};//this requires 1 shot, you can't define and leave like this and keep declaring later
		
		
		
		int[] intArray = new int[3];
		
		intArray[0] = 2;
		intArray[1] = null;
		
		
		
	}

}
