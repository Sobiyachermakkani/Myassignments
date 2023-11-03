package week3.day1.interfaceabstract;

public class JavaConnection implements DatabaseConnection{
	
	public void connect() {
		System.out.println("Connect abstract method from DBConnection interface");
	}
	public void disconnect() {
		System.out.println("Disconnect abstract method from DBConnection interface");
	}
	public void  executeUpdate() {
		System.out.println("Execute update abstract method from DBConnection interface");
	}
	public static void main(String[] args) {
		JavaConnection obj= new JavaConnection();
		obj.connect();
		obj.executeUpdate();
		obj.disconnect();

	}

}
