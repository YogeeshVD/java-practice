import java.util.*;
public class Main {

	public static void main(String[] args) {
		System.out.println("Menu");
		System.out.println("1. Player Details of Delivery");
		System.out.println("2. Run Details of Delivery");
		Scanner sc = new Scanner(System.in);
		Delivary del = new Delivary() ;
		int opt = Integer.parseInt(sc.nextLine());
		
			if (opt == 1) {
				System.out.println("Enter the bowler name");
				String bowler = sc.nextLine();
				System.out.println("Enter the batsman name");
				String batsman = sc.nextLine();
				del.displayDeliveryDetails(bowler, batsman);
				
			}

		
			if (opt == 2) {
				System.out.println("Enter the number of runs");
				long runs = sc.nextLong();
				del.displayDeliveryDetails(runs);
				

			}

		}

	}
