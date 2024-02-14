import java.util.Scanner;

public class EmailTest {

	public void check(String email) throws InvalidEmailException {
		if (email.indexOf("@") == -1) {
			throw new InvalidEmailException("Invalid Email as @ is not found in this...");
		} else {
			System.out.println("Email is  " +email);
		}
	}
	public static void main(String[] args) {
		String email;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email   ");
		email = sc.next();
		EmailTest obj = new EmailTest();
		try {
			obj.check(email);
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}
	}
}
