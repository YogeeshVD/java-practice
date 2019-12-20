
public class Product {
	private long id;
	private String productName;
	private String supplierName;

	Product(long i,String n,String m){ 
		id = i;
		productName = n;
		supplierName = m;
	}

	public void setid(long id) {
		this.id = id;
	}

	public long getid() {
		return id;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}

	public String getproductName() {
		return productName;
	}

	public void setsupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getsupplierName() {
		return supplierName;
	}

	

	void display() {
		System.out.println("Product Id is "+id);
		System.out.println("Product Name is "+productName);
		System.out.println("Supplier Name is "+supplierName);
	
	}
}
