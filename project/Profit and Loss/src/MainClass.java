import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfitLoss plc = new ProfitLoss();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of dozens purchased");
		int purchase = sc.nextInt();
		
		System.out.println("Cost per dozen");
		int perPrice = sc.nextInt();
		
		System.out.println("Selling price per item");
		int selPrice = sc.nextInt();
		
		plc.cal(purchase,perPrice,selPrice);
		
	}

}
