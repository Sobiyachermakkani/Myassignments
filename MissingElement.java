package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 10, 6, 8 };
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			array.add(arr[i]);
		}
		System.out.println("Array to list : " + array);
		Collections.sort(array);

		System.out.println("After sorting, The list are : " + array);
		System.out.println("The size of the array is : " + array.size()); // 7
		for (int i = 0; i < array.size() - 1; i++) {
			if ((array.get(i)) + 1 != array.get(i + 1)) {
				System.out.println((array.get(i)) + 1);

			}

		}
	}

}
