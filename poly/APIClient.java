package week3.day1.poly;

//Method overloading
public class APIClient {
	public String sendRequest(String endpoint)
	{
		return "Calling SendReq method with one argument";
	}
	
public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	System.out.println("Calling sendReq method with three arguments");
}

	public static void main(String[] args) {
		APIClient obj= new APIClient();
		obj.sendRequest("Security","Request sent", true);
		System.out.println(obj.sendRequest("Security risk"));

	}

}
