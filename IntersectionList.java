package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 11, 4, 6, 7 };
		int[] arr1 = { 1, 2, 8, 4, 9, 7 };
		List<Integer> array = new ArrayList<Integer>();
		List<Integer> array1 = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			array.add(arr[i]);
		}
		for (int j = 0; j < arr1.length; j++) {
			array1.add(arr1[j]);
		}
		int result;
		System.out.println("The arr list : " + array);
		System.out.println("The arr1 list  " + array1);

		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array1.size(); j++) {
				if (array.get(i) == array1.get(j)) {
					result = array.get(i);
					System.out.println(result);

				}
			}
		}

	}
}
