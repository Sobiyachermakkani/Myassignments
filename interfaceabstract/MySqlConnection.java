package week3.day1.interfaceabstract;

public abstract class MySqlConnection implements DatabaseConnection {
	public void connect() {
		System.out.println("Connect abstract method from DBConnection interface - mysql");
	}
	public void disconnect() {
		System.out.println("Disconnect abstract method from DBConnection interface-mysql");
	}
	public abstract void executeQuery();
}
