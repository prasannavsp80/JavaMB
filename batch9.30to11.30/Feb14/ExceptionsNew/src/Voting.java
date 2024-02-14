import java.util.Scanner;

public class Voting {

	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You are not Elligible for Voting...");
		}
		System.out.println("You Can Vote...");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter Age  ");
		age = sc.nextInt();
		Voting obj = new Voting();
		try {
			obj.check(age);
		} catch (VotingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
