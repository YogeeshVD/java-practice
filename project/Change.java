import java.util.*;
class Change
{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the content of document");
		String name = sc.nextLine();
		
		System.out.println("Enter the old name of the company");
		String name2 = sc.nextLine();
		
		System.out.println("Enter the new name of the company");
		String name3 = sc.nextLine();
		
		String name4= name.replace(name2,name3);
		
		System.out.print(name4);
	}
}