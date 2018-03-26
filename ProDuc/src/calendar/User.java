package calendar;

import java.io.Serializable;

public class User implements Serializable{

	private String username;
	private String password;
	PersonalCalendar calendar;
	
	public User(String u, String p) {
		username = u;
		password = p;
		calendar = new PersonalCalendar();
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public PersonalCalendar getCalendar() {
		return calendar;
	}
}
