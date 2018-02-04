package calendar;

import java.util.ArrayList;

import javax.swing.JLabel;

public class Month {
	ArrayList<Day> dayList;
	ArrayList<JLabel> labelList;
	
	public Month(int n) {
		dayList = new ArrayList<Day>();
		labelList = new ArrayList<JLabel>();
		
		
		for(int i=0; i < n; i++) {
			dayList.add(new Day(i));
		}
	}
	
	public ArrayList<Day> getDayList() {
		return dayList;
	}
}
