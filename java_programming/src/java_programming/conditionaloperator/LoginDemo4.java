package java_programming.conditionaloperator;

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = args[0];
		String pw =args[1];
		
		if((id.equals("cyb") || id.equals("CR")) && pw.equals("1105") ) {
			System.out.println("success");
		}
		else {
			System.out.println("fales");
		}
	}

}
