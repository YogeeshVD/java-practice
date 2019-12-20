import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the 2 numbers ");
		long a = Long.parseLong(sc.nextLine());
		long b = Long.parseLong(sc.nextLine());
		long c = a / b;

		try {
			if (c == 0)
				throw new Divide("DivideByZeroException caught ");
			else
				System.out.println("The quotient of" + a + "/" + b + "=" + c);
		} catch (Divide a1) {
			System.out.println(a1);
		} finally {
			System.out.println("Inside finally block ");
		}
	}
}

class Divide extends Exception {
	public Divide(String str) {
		System.out.println(str);
	}
}