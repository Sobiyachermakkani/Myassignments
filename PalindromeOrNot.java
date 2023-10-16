package week1.day2;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int input=121;
		int output=0,rem;
		for(int i=input;i>0;i=i/10){
			rem=i%10;
			output=(output*10)+rem;
		}
		if(input==output) {
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
	}}