package java_programming.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0];
        String password = args[1];
        if (id.equals("cyb")) {
            if (password.equals("1105")) {
                System.out.println("success");
            } else {
                System.out.println("fales");
            }
 
        } else {
            System.out.println("fales");
        }

	}

}
