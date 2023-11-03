package week3.day1.Inheritance;

public class TextField extends WebElement{
	public void  getText() 
	{
		System.out.println("Gettext method from textfield class");
	}
	public static void main(String[] args) {
		TextField obj1= new TextField();
		obj1.click();
		obj1.getText();
		obj1.setText("Subclass");

	}

}
