package calendar;

import java.util.ArrayList;

public class Day {
	ArrayList<Event> eventList;
	int dayNum;
	
	public Day(int n) {
		eventList = new ArrayList<Event>();
		dayNum = n;
	}

	public void addEvent(Event e) {
		eventList.add(e);
	}
	
	public void removeEvent(Event e) {
		eventList.remove(e);
	}
	
	public ArrayList<Event> getEventList() {
		return eventList;
	}
}
