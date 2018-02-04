package calendar;

import java.util.ArrayList;

public class Year {
	ArrayList<Month> monthList;
	int year;
	boolean leap = false;
	
	public Year(int y) {
		monthList = new ArrayList<Month>();
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
	}
	
	public ArrayList<Month> getMothList() {
		return monthList;
	}
	
	public int getYearNum() {
		return year;
	}
}
