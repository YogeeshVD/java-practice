import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr product Id");
		int id = sc.nextInt();
		
		System.out.println("Enter the product name");
		String product = sc.next();
		
		System.out.println("Enter the supplier name");
		String supplier = sc.next();
		
		Product myProduct = new Product();
		myProduct.setid(id);
		System.out.println("Product Id is "+myProduct.getid());
		
		myProduct.setproduct(product);
		System.out.println("Product name is "+myProduct.getproduct());
		
		myProduct.setsupplier(supplier);
		System.out.println("Supplier Name is "+myProduct.getsupplier());

	}

}
