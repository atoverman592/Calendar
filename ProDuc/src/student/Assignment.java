package student;

import java.io.Serializable;
import java.util.Date;

import calendar.Event;

public class Assignment extends Event implements Serializable{

	public Assignment(String newTitle, Date newStartTime) {
		super(newTitle, newStartTime);
		// TODO Auto-generated constructor stub
	}
	
	public Assignment(String newTitle, Date newStartTime, String description) {
		super(newTitle, newStartTime, description);
		// TODO Auto-generated constructor stub
	}

}
