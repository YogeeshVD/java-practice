import java.util.*;
class RedCrossWhile
{
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] tent = new int[a];
		int total=0;
		int i=0;
		while(i<tent.length) {
			tent[i] = sc.nextInt();
			total=total+tent[i];
			i++;
		}
		System.out.print(total);
	}
}