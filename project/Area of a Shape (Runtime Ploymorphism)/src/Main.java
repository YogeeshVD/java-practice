import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Rectangle");
		System.out.println("2.  Square");
		System.out.println("3. Circle");
		System.out.println("4. hexagon");
		System.out.println("Area of Area Calculator --- Choose your shape");

		int ch = Integer.parseInt(sc.nextLine());
		Shape shape = null;

		if (ch == 1) {
			System.out.print("Enter length: ");
			int length = Integer.parseInt(sc.nextLine());
			System.out.print("Enter breadth: ");
			int breadth = Integer.parseInt(sc.nextLine());
			shape = new Rectangle(length, breadth);
		} else if (ch == 2) {

			System.out.print("Enter the side: ");
			int side = Integer.parseInt(sc.nextLine());
			shape = new Square(side);
		} else if (ch == 3) {
			System.out.print("Enter radius: ");
			int radius = Integer.parseInt(sc.nextLine());
			shape = new Circle(radius);
		}

		else if (ch == 4) {
			System.out.print("Enter the side: ");
			int side = Integer.parseInt(sc.nextLine());
			shape = new Hexagon(side);
		}
		System.out.printf("Area of %s is:%.2f", shape.getShapeName(), shape.calculateArea());

	}
}
