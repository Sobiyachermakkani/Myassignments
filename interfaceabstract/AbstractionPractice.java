package week3.day1.interfaceabstract;

public class AbstractionPractice extends MySqlConnection{
	public void  executeUpdate() {
		System.out.println("Execute update abstract method from DBConnection interface-mysql");
	}
	public void executeQuery() {
		System.out.println("Execute query method from mysqlconnection abstarct class");
	}

	public static void main(String[] args) {
		AbstractionPractice obj= new AbstractionPractice();
		obj.connect();
		obj.disconnect();
		obj.executeQuery();
		obj.executeUpdate();

	}

}
