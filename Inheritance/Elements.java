package week3.day1.Inheritance;

public class Elements extends Button {

	public static void main(String[] args) {
		Button b= new Button();
		CheckBoxButton cb= new CheckBoxButton();
		RadioButton rb= new RadioButton();
		Elements e= new Elements();
		e.submit(); //button class
		b.click();//webElement class
		b.setText("Inheritance"); //WebElement class
		cb.clickCheckButton(); //CheckBoxButton class
		rb.selectRadioButton(); //radio button class
		

	}

}
