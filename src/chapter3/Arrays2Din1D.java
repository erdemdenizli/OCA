package chapter3;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays2Din1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] ob1 = {1,2,3};
		System.out.println(Arrays.toString(ob1));		
		
		int[][] arr = new int[2][2];
		arr[1][0] = 1;
		arr[1][1] = 2;
		//arr[1][2] = 3; //throws exception at this line if you run, because out of bounds right at this line
		System.out.println(Arrays.toString(arr[1]));
		
		int[] intArr = new int[5];
		arr[0] = intArr;
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		
		int[][] game = new int[6][6];
		int a[]= {1,2,3,4,5,6,7,8};
		game[3][3] = 6;
		Object[] obj = game;
		obj[3] = a; //doesn't print
		game[3]=a; //this prints
		System.out.println(Arrays.toString(obj[3]));
		System.out.println(game[3][7]);
		
		game[3] = 5; //gives error because knows what is assigned should be an int[]
		obj[3] = 5; //does not give error because obj is an Object[] and 5 is an Integer obj, so does not complain 
					//but it does not print if you try because behind the scenes it is still a 2D int array
	
	}

}
