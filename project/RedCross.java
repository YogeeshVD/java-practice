import java.util.*;
class RedCross
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] tent = new int[a];
		
		for(int i=0;i<tent.length;i++) {
			tent[i] = sc.nextInt();
		}
		
		int c=0;	
		for(int i=0;i<tent.length;i++){
			c=c+tent[i];
		}
		System.out.print(c);
		
	}
}