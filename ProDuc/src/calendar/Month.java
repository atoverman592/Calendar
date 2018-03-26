package calendar;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Month implements Serializable{
	ArrayList<Day> dayList;
	ArrayList<JLabel> labelList;
	
	public Month(int n) {
		dayList = new ArrayList<Day>();
		
		
		for(int i=0; i < n; i++) {
			dayList.add(new Day(i));
		}
	}
	
	public ArrayList<Day> getDayList() {
		return dayList;
	}
}
