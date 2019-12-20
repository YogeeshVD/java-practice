
public class ProfitLoss {
	public void cal(int purPrice, double perPrice, double selPrice) {
	double Price = perPrice/12;
	double profit= selPrice-Price;
	double percent = (profit/Price)*100;
	System.out.printf("Sam's profit percentage is %.2f",percent);
	System.out.println(" percent");
	}
}