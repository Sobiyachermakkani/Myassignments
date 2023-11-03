package week3.day1.Inheritance;

public class WebElement {
	public void  click() {
		System.out.println("Click method - Webelement class");
	
	}
	public void setText(String text) {
		System.out.println("Learning Inheritance from WebElement class");
	}
	public static void main(String[] args) {
		WebElement obj= new WebElement();
		obj.setText("Hello");
		obj.click();
	}
}
