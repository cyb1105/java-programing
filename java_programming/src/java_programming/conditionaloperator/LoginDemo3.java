package java_programming.conditionaloperator;

public class LoginDemo3 {

	public static void main(String[] args) {
		String id= args[0];
		String password = args[1];
		
		if (id.equals("cyb") && password.equals("1105")) {
			System.out.println("success");
			}
		else {
				System.out.println("fales");
		}	
		
	}

}
