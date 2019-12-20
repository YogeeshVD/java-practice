import java.util.*;
class SecureJava
{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String x= sc.nextLine();
		
		System.out.println("Enter the start string");
		String y= sc.nextLine();
		
		if(x.startsWith(y)){
			System.out.println(x +"starts with 'https'" );
		}else{
			System.out.println(x + "does not starts with 'https'");
		}	
		
	}
}