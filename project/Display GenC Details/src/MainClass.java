import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Trainee trn = new Trainee(2, 969143, "John");
		System.out.println("Enter the number of GenCs");
		int gen = sc.nextInt();

		for (int k = 1; k <= gen; k++) {
			System.out.println("Enter the employee Id");
			int empId = sc.nextInt();
			trn.setempId(empId);
			
			System.out.println("Enter Name");
			String name = sc.next();
			trn.setname(name);

		}
		trn.display();
		}
	}

