package calendar;

import java.io.Serializable;
import java.util.ArrayList;

import student.Semester;

public class Year implements Serializable{
	ArrayList<Month> monthList;
	ArrayList<Semester> semesterList;
	int year;
	boolean leap = false;
	
	public Year(int y) {
		monthList = new ArrayList<Month>();
		semesterList = new ArrayList<Semester>();
		year = y;
		
		if(year%4 == 0) {
			leap = true;
		}
		
		if(leap) {
			monthList.add(new Month(31));
			monthList.add(new Month(29));
			monthList.add(new Month(31));
			monthList.add(new Month(30));
			monthList.add(new Month(31));
			monthList.add(new Month(30));
			monthList.add(new Month(31));
			monthList.add(new Month(31));
			monthList.add(new Month(30));
			monthList.add(new Month(31));
			monthList.add(new Month(30));
			monthList.add(new Month(31));
		}
		
		else {
			monthList.add(new Month(31));
			monthList.add(new Month(28));
			monthList.add(new Month(31));
			monthList.add(new Month(30));
			monthList.add(new Month(31));
			monthList.add(new Month(30));
			monthList.add(new Month(31));
			monthList.add(new Month(31));
			monthList.add(new Month(30));
			monthList.add(new Month(31));
			monthList.add(new Month(30));
			monthList.add(new Month(31));
		}
		
		semesterList.add(new Semester("Spring", 4, 5, 1, 5, year, year));
		semesterList.add(new Semester("Fall", 12, 17, 8, 12, year, year));
	}
	
	public ArrayList<Month> getMothList() {
		return monthList;
	}
	
	public int getYearNum() {
		return year;
	}
	
	public void addSemester(Semester s) {
		semesterList.add(s);
	}
	
	public ArrayList<Semester> getSemesterList() {
		return semesterList;
	}
	
}
