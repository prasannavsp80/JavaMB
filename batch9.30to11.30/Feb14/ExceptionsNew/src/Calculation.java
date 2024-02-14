import java.util.Scanner;

public class Calculation {

	public void add(int a, int b) throws NegativeException {
		if (a < 0 || b < 0) {
			throw new NegativeException("Negative Numbers Not Allowed...");
		} else if (a == 0 || b == 0) {
			throw new NegativeException("Zero is Invalid Value...");
		} else {
			int c = a+b;
			System.out.println("Sum is  " +c);
		}
	}
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers  ");
		a = sc.nextInt();
		b = sc.nextInt();
		Calculation obj = new Calculation();
		try {
			obj.add(a, b);
		} catch (NegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
