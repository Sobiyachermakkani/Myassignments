package week3.day1;

public class LearnPalindromeOrNot {

	public static void main(String[] args) {
		int input=12345; //121
		int output=0,rem;
		for(int i=input;i>0;i=i/10){
			rem=i%10;
			output=(output*10)+rem;
		}
		if(input==output) {
			System.out.println("The given input is a palindrome");
		}
		else
		{
			System.out.println("The given input is not a palindrome");
		}
	}}