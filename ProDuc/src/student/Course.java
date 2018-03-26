package student;

import java.io.Serializable;

public class Course implements Serializable{
	String title;
	
	public Course(String t) {
		title = t;
	}
}
