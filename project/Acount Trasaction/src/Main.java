import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number");
		String accountNumber = sc.nextLine();

		System.out.println("Enter the Account Balance");
		int balance = Integer.parseInt(sc.nextLine());

		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
		int opt = Integer.parseInt(sc.nextLine());
		Account acc = new Account(accountNumber, balance);

		switch (opt) {
		case 1:
			if (opt == 1) {
				System.out.println("Enter the amount to deposit");
				int dep = Integer.parseInt(sc.nextLine());
				acc.deposit(dep);
				break;
			}
		case 2:
			if (opt == 2) {
				System.out.println("Enter the amount to withdraw");
				int wth = Integer.parseInt(sc.nextLine());

				if (wth < balance) {
					acc.withdraw (wth);
				} else {
					System.out.println("Insufficient Balance");
				}
				break;
			}

		default: {
			System.out.println("none");
		}

		}

	}

}
