package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		String array[] = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		System.out.println("String to list : " + list); // converting string to list
		Collections.sort(list);
		String result;
		List<String> result1 = new ArrayList<String>();
		for (int i = list.size() - 1; i >= 0; i--) {
			result = list.get(i);

			result1.add(result);
		}
		System.out.println("Sorting using collections- " + result1);
	}

}
