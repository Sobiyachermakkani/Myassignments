package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
    int a=0;
    int b=1;
    System.out.print(a +",");
    System.out.print(b+",");
    int n=8, C;
    for (int i=3;i<=n;i++) {
	C=a+b;
	System.out.print(C+",");
	a=b;
	b=C;
	 
 }
	}

}
