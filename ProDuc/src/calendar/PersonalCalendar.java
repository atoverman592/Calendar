package calendar;

import java.io.Serializable;
import java.util.ArrayList;

import personal.Notes;

public class PersonalCalendar implements Serializable{

	private ArrayList<Year> yearList;

	private ArrayList<Notes> noteList = new ArrayList<Notes>();

	public PersonalCalendar() {
            yearList = new ArrayList<Year>();
            for (int i = 0; i < 5; i++) {
                    yearList.add(new Year(2018 + i));
            }
	}

	public int getNumberOfYears() {
		return yearList.size();
	}

	public ArrayList<Year> getYearList() {
		return yearList;
	}
	
	public boolean addNote(Notes note) {
		boolean added = false;
		noteList.add(note);
		added = true;
		return added;
	}
}
