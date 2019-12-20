public class Hexagon extends Shape {

	public Hexagon(String shapeName) {
		super(shapeName);

	}

	private int side;

	public Hexagon(int side) {
		super("Hexagon");
		this.side = side;
	}
	
	public  double calculateArea() {
	     
        double area =  ((3 * Math.sqrt(3) *  
                (side * side)) / 2);
        
        return 0;

	
	}

	
	}

