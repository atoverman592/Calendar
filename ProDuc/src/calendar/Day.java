package calendar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


public class Day implements Serializable {
	ArrayList<Event> eventList;
	int dayNum;

	public Day(int n) {
		eventList = new ArrayList<Event>();
		dayNum = n;
		
		boolean testFill = false;
		if (testFill) {
			Random rand = new Random();
			int random = rand.nextInt(6);
			for (int i = 0; i < random; i++) {
				eventList.add(new Event("Sample Title " + (i + 1), new Date()));
			}
		}
	}

	public void addEvent(Event event) {
		eventList.add(event);
	}

	public void removeEvent(Event e) {
		eventList.remove(e);
	}

	public ArrayList<Event> getEventList() {
		return eventList;
	}
}
