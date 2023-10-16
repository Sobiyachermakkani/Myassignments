package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n=13;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				System.out.println("The number is not a prime");
				break;
			}
		
			else {
				System.out.println("The given number is prime");
				break;
			}
		}

	}}


