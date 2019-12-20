import java.util.*;
class RedCrossForEach
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] tent = new int[a];
		
		for(int i=0;i<tent.length;i++) {
			tent[i] = sc.nextInt();
		}
		int total=0;
		for(int x:tent) {
		
			total=total+x;
		}
		System.out.print(total);
		
	}
}