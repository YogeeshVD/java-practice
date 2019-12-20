import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ur age : ");
		int age = Integer.parseInt(sc.nextLine());

		try {
			if (age < 19)
				throw new AgeException("Not valid");
			else
				System.out.println("Welcome to vote");
		} catch (AgeException a) {
			System.out.println(a);
		}
	}
}

class AgeException extends Exception {
	public AgeException(String str) {
		System.out.println(str);
	}
}
