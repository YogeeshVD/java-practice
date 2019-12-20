import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> list = new ArrayList<Integer>(num);
		for (int i = 0; i < num; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);

		for (int x : list)
			System.out.println(x);
	}
}
