package calendar;

import java.io.Serializable;
import java.util.ArrayList;

public class PersonalCalendar implements Serializable{

	ArrayList<Year> yearList;

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
}
