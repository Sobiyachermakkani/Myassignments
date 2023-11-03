package week3.day1.poly;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
		//super.performCommonTasks();
		System.out.println("Perform common tasks method from LoginPage class");
	}

	public static void main(String[] args) {
		LoginPage obj= new LoginPage();
		BasePage obj1= new BasePage();
		obj.performCommonTasks();
		obj1.performCommonTasks();
	}

}
