package week3.day1.interfaceabstract;

//interface
public interface DatabaseConnection {
	//by default - interface methods are abstract methods
	
	public void connect();
	public void disconnect();
	public void  executeUpdate();

}
