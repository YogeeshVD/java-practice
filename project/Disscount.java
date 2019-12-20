import java.util.*;
class Disscount
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Price of item 1");
		float item1 = sc.nextFloat();
		
		System.out.println("Price of item 2");
		float item2= sc.nextFloat();
		
		System.out.println("Discount in percentage :");
		int discount= sc.nextInt();
		
		float total=(item1+item2);
		System.out.println("Total amount :$"+total);
		
		float discountPrice=(((float)discount/100)*total);
		float last=(total-discountPrice);
		
		System.out.println("Discounted amount :$"+last);
		
		System.out.println("Saved amount :$"+discountPrice);
	}
}
		
		