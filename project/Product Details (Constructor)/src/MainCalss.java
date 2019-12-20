import java.util.*;
public class MainCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr product id");
		long id = sc.nextLong();
		System.out.println("Enter thr product name");
		String productName = sc.next();
		System.out.println("Enter the supplier name");
		String supplierName = sc.next();
		
		Product prd = new Product(id, productName, supplierName);
		
		prd.display();
	}

}
