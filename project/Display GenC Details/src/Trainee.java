
public class Trainee {
	int empId;
	int gen;
	String name;

	private static final String COHORT_CODE = "CHNAJ19004";

	Trainee(int i, int j, String m) {
		gen = i;
		empId = j;
		name = m;
	}


	public void setempId(int empId) {
		this.empId = empId;
	}

	public int getempId() {
		return empId;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	void display() {
		System.out.printf(getempId()+" " + getname() + "  CHNAJ19004");
	}
}
