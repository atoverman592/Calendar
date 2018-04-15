package student;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import calendar.Event;
import calendar.User;

public class Semester implements Serializable{
	String title;
	int startDay;
	int endDay;
	int startMonth;
	int endMonth;
	int startYear;
	int endYear;
	ArrayList<Course> courseList;
	
	public Semester(String t, int sd, int ed, int sm, int em, int sy, int ey) {
		title = t;
		courseList = new ArrayList<Course>();
		startDay = sd;
		endDay = ed;
		startMonth = sm;
		endMonth = em;
		startYear = sy;
		endYear = ey;
	}
	
	public void addCourse(Course c, User u) {
		for (int y = startYear-2018; y <= endYear-2018; y++) {
			for(int m = startMonth-1; m <= endMonth-1; m++) {
				if (m == startMonth-1) {
					for(int d = startDay; d <= u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().size()-1; d++) {
						String dayOfWeek = null;
						try {
							SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
							Date MyDate;
							String testDate = (d+1)+"/"+(m+1)+"/"+(y+2018);
							MyDate = newDateFormat.parse(testDate);
							newDateFormat.applyPattern("EEEE");
							dayOfWeek = newDateFormat.format(MyDate);
							
							//System.out.println(testDate+ " " + dayOfWeek);
							
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						switch (dayOfWeek) {
							case "Sunday":
								if (c.isSun()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Monday":
								if (c.isMon()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									//System.out.println("TRUE");
									break;
								}else {
									break;
								}
							case "Tuesday":
								if (c.isTue()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Wednesday":
								if (c.isWed()) {
									//System.out.println("TRUE");
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Thursday":
								if (c.isThu()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Friday":
								if (c.isFri()) {
									//System.out.println("TRUE");
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Saturday":
								if (c.isSat()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
									}else {
										break;
									}
							default: 
								System.out.println("Error");
						}
						
					}
				}
				
				else if(m == endMonth-1) {
					for(int d = 0; d <= endDay; d++) {
						String dayOfWeek = null;
						try {
							SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
							Date MyDate;
							String testDate = (d+1)+"/"+(m+1)+"/"+(y+2018);
							MyDate = newDateFormat.parse(testDate);
							newDateFormat.applyPattern("EEEE");
							dayOfWeek = newDateFormat.format(MyDate);
							
							//System.out.println(testDate+ " " + dayOfWeek);
							
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						switch (dayOfWeek) {
							case "Sunday":
								if (c.isSun()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Monday":
								if (c.isMon()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									//System.out.println("TRUE");
									break;
								}else {
									break;
								}
							case "Tuesday":
								if (c.isTue()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Wednesday":
								if (c.isWed()) {
									//System.out.println("TRUE");
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Thursday":
								if (c.isThu()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Friday":
								if (c.isFri()) {
									//System.out.println("TRUE");
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Saturday":
								if (c.isSat()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
									}else {
										break;
									}
							default: 
								System.out.println("Error");
						}
					}
				}
				
				else {
					for(int d = 0; d <= u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().size()-1; d++) {
						String dayOfWeek = null;
						try {
							SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
							Date MyDate;
							String testDate = (d+1)+"/"+(m+1)+"/"+(y+2018);
							MyDate = newDateFormat.parse(testDate);
							newDateFormat.applyPattern("EEEE");
							dayOfWeek = newDateFormat.format(MyDate);
							
							//System.out.println(testDate+ " " + dayOfWeek);
							
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						switch (dayOfWeek) {
							case "Sunday":
								if (c.isSun()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Monday":
								if (c.isMon()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									//System.out.println("TRUE");
									break;
								}else {
									break;
								}
							case "Tuesday":
								if (c.isTue()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Wednesday":
								if (c.isWed()) {
									//System.out.println("TRUE");
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Thursday":
								if (c.isThu()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Friday":
								if (c.isFri()) {
									//System.out.println("TRUE");
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
								}else {
									break;
								}
							case "Saturday":
								if (c.isSat()) {
									u.getCalendar().getYearList().get(y).getMothList().get(m).getDayList().get(d).getEventList().add(new Event(c.getTitle(), c.getInstructor().getInName()));
									break;
									}else {
										break;
									}
							default: 
								System.out.println("Error");
						}
					}
				}
			}
		}
	}
	
	public int getStartDay() {
		return startDay;
	}

	public void setStartDay(int startDay) {
		this.startDay = startDay;
	}

	public int getEndDay() {
		return endDay;
	}

	public void setEndDay(int endDay) {
		this.endDay = endDay;
	}

	public int getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(int startMonth) {
		this.startMonth = startMonth;
	}

	public int getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(int endMonth) {
		this.endMonth = endMonth;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public int getEndYear() {
		return endYear;
	}

	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}

	public ArrayList<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}
