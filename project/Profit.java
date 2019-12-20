import java.util.*;
public class Profit
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of dozens of toys purchased");
		int purchase = sc.nextInt();
		
		System.out.println("Enter the price per dozen");
		double price = sc.nextDouble();
		
		System.out.println("Enter the selling price of 1 toy");
		double sel = sc.nextDouble();
		double onePrice=(price/12);
		double inter=(sel-onePrice);
		double profit=((inter/onePrice)*100);
	
		System.out.printf("Sam's profit percentage is %.2f", profit);
		System.out.print(" percent");

	}
}

		
		