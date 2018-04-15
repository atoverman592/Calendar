package student;

public class Instructor {
	String inName;
	String inEmail;
	
	public Instructor(String n) {
		inName = n;
	}

	public String getInName() {
		return inName;
	}

	public void setInName(String inName) {
		this.inName = inName;
	}

	public String getInEmail() {
		return inEmail;
	}

	public void setInEmail(String inEmail) {
		this.inEmail = inEmail;
	}
}
