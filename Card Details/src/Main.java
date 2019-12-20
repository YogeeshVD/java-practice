import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Card card1 = new MembershipCard("collin", "45678", "20/11/2021", 10);
		Card card2 = new PaybackCard("Anandhi", "12345", "14/01/2020", 1000, 50000);

		System.out.println("Select the Card");
		System.out.println("1.Payback Card "); 
		System.out.println("2.Membership Card ");
		int opt = Integer.parseInt(scn.nextLine());

		switch (opt) {
		case 1:
			if (opt == 1) {
				System.out.print("Enter the Card Details:");
				String name = scn.nextLine();
				card2.setHolderName(name);
				String number = scn.nextLine();
				card2.setCardNumber(number);
				String date = scn.nextLine();
				card2.setExpiryDate(date);

				System.out.println("Enter points in card  ");
				int point = Integer.parseInt(scn.nextLine());

				System.out.println("Enter Amount  ");
				double amt = Double.parseDouble(scn.nextLine());
				card2.display();
				break;
			}
		case 2:
			if (opt == 2) {
				System.out.print("Enter the Card Details:");
				String name1 = scn.nextLine();
				card1.setHolderName(name1);
				String number1 = scn.nextLine();
				card1.setCardNumber(number1);
				String date2 = scn.nextLine();

				card1.setExpiryDate(date2);

				System.out.println("Enter rating in card  ");
				long rate = Long.parseLong(scn.nextLine());
				card1.display();
				break;
			}
		default:
			System.out.println("Invalid Data");
			break;
		}

	}
}
