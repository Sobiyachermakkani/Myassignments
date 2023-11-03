package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class secondLargestNoList {

	public static void main(String[] args) {
		int[] a = { 3, 2, 11, 4, 6, 7 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		System.out.println("Coverting array to list : " + list);
		Collections.sort(list);
		System.out.println("After sorting list " + list);

		int seclarge, largest;
		seclarge = list.size() - 2;
		largest = list.get(seclarge);
		System.out.println("The second largest in the list is ->" + largest);
	}

}
