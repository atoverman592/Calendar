package calendar;

import student.*;
import java.util.ArrayList;

public class PersonalCalendar {

	ArrayList<Year> yearList;
	ArrayList<Semester> semesterList;
	
	public PersonalCalendar(int n) {
		
		yearList = new ArrayList<Year>();
		for (int i = 0; i < n; i++) {
			yearList.add(new Year(2018 + i));
		}
	}
	
	public void addSemester(Semester s) {
		semesterList.add(s);
	}
	
	public int getNumberOfYears() {
		return yearList.size();
	}
	
	public ArrayList<Year> getYearList() {
		return yearList;
	}
}
