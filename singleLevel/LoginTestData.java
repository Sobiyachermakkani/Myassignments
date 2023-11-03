package week3.day1.singleLevel;

//Single level inheritance
public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Enter your username");
	}

	public void enterPassword() {
		System.out.println("Enter the password");
	}

	public static void main(String[] args) {
		LoginTestData obj = new LoginTestData();
		obj.enterCredentials(); // From TestData class
		obj.enterUsername(); // From Logintestdata class
		obj.enterPassword();// From Logintestdata class
		obj.navigateToHomePage(); // From testdata class

	}

}
