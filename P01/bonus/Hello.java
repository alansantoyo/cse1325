import java.util.Scanner;

class Hello {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		String name;
		System.out.print("What is your name? ");
		name = in.nextLine();
		System.out.println("Hello, " + name);
	}
}
