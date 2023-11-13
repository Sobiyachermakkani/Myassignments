package week4.day2.assignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char ch[] = test.toCharArray(); // converted string to characters and stored in an array
		for (int i = 0; i <= ch.length - 1; i++) {
			if (i%2!=0) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);

	}

}
