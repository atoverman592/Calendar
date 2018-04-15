package calendar;

import java.io.Serializable;
import java.util.ArrayList;

import personal.*;
import student.*;

public class User implements Serializable{

	private String username;
	private String password;
	PersonalCalendar calendar;
	ArrayList<Semester> semesterList = new ArrayList<Semester>();
	
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
	
	public ArrayList<Semester> getSemesterList() {
		return semesterList;
	}
}
