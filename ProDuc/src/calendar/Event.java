package calendar;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable{
	String title = null;
	Date startTime = null;
	Date endTime = null;
	String description = null;

	
	public Event(String newTitle, String newDescription) {
		title = newTitle;
		description = newDescription;
	}
	
	public Event(String newTitle, Date newStartTime) {
		title = newTitle;
		startTime = newStartTime;
	}
	
	public Event(String newTitle, Date newStartTime, Date newEndTime) {
		title = newTitle;
		startTime = newStartTime;
		endTime = newEndTime;
	}
	
	public Event(String newTitle, Date newStartTime, Date newEndTime, String newDescription) {
		title = newTitle;
		startTime = newStartTime;
		endTime = newEndTime;
		description = newDescription;
	}
	
	public Event(String newTitle, Date newStartTime, String newDescription) {
		title = newTitle;
		startTime = newStartTime;
		description = newDescription;
	}
	
/*	public Event(String newTitle, String newDescription) {
		title = newTitle;
		description = newDescription; 
	}*/
        
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}