
public class Delivary {
	private String bowler;
	private String batsman;
	private long runs;

	public void displayDeliveryDetails(String bowler, String batsman) {
		System.out.print("Player Details of Delivery\n");
		System.out.println("Bowler :" + bowler);
		System.out.println("Batsman :" + batsman);

	}

	public void displayDeliveryDetails(long runs) {
		System.out.println("Enter thr number of runs");
		if (runs == 6) {
			System.out.println("Number of runs in delivery " + runs);
			System.out.println("Its's a sixer..!");
		} else if (runs == 4) {
			System.out.println("Number of runs in delivery " + runs);
			System.out.println("Its's a boundary..!");
		} else
			System.out.print("Number of runs in delivery " + runs);

	}

}
