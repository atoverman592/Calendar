package student;

import java.io.Serializable;

public class Course implements Serializable{
	public boolean isMon() {
		return mon;
	}

	public void setMon(boolean mon) {
		this.mon = mon;
	}

	public boolean isTue() {
		return tue;
	}

	public void setTue(boolean tue) {
		this.tue = tue;
	}

	public boolean isWed() {
		return wed;
	}

	public void setWed(boolean wed) {
		this.wed = wed;
	}

	public boolean isThu() {
		return thu;
	}

	public void setThu(boolean thu) {
		this.thu = thu;
	}

	public boolean isFri() {
		return fri;
	}

	public void setFri(boolean fri) {
		this.fri = fri;
	}

	public boolean isSat() {
		return sat;
	}

	public void setSat(boolean sat) {
		this.sat = sat;
	}

	public boolean isSun() {
		return sun;
	}

	public void setSun(boolean sun) {
		this.sun = sun;
	}

	public int getStarthr() {
		return starthr;
	}

	public void setStarthr(int starthr) {
		this.starthr = starthr;
	}

	public int getEndhr() {
		return endhr;
	}

	public void setEndhr(int endhr) {
		this.endhr = endhr;
	}

	public int getStartmin() {
		return startmin;
	}

	public void setStartmin(int startmin) {
		this.startmin = startmin;
	}

	public int getEndmin() {
		return endmin;
	}

	public void setEndmin(int endmin) {
		this.endmin = endmin;
	}

	String title;
	Instructor instructor;
	boolean mon;
	boolean tue;
	boolean wed;
	boolean thu;
	boolean fri;
	boolean sat;
	boolean sun;
	int starthr;
	int endhr;
	int startmin;
	int endmin;
	
	public Course(String ti, String insName, boolean m, boolean t, boolean w, boolean th, boolean f, boolean s, boolean su, int sh, int sm, int eh, int em) {
		title = ti;
		instructor = new Instructor(insName);
		mon = m;
		tue = t;
		wed = w;
		thu = th;
		fri = f;
		sat = s;
		sun = su;
		starthr = sh;
		endhr = eh;
		startmin = sm;
		endmin = em;
		
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
