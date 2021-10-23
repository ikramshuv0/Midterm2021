package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */


		//implementation here...
		int  a[] = new int[]{12,11,6,5,3,8,911,115,120,315,87,78};

		System.out.println("Lowest number from the array is :"+LowestNumber.lowestNumber(a));

		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(LowestNumber.lowestNumber(a));

		List list =  arrList;


	}

	public static int lowestNumber(int [] array){

		int lowest = Integer.MAX_VALUE;

		for (int value : array) {
			if (lowest > value) {
				lowest = value;
			}
		}

		return lowest;
	}
}
