
public class SbExample1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Welcome to Java Programming...");
		System.out.println("Default Content  " +sb);
		sb.append("\nFrom Excelr Hitech City");
		System.out.println(sb);
		sb.insert(5, "Trainer Prasanna...");
		System.out.println("Data After Insertion  \n");
		System.out.println(sb);
	}
}
