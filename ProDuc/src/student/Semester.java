package student;

import java.io.Serializable;

public class Semester implements Serializable{
	String title;
	
	public Semester(String t) {
		title = t;
	}
	
	public String getTitle() {
		return title;
	}
}
