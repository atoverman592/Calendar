package personal;

import java.io.Serializable;
import java.util.Date;

import calendar.Event;

public class Fitness extends Event implements Serializable{
	String weeklyGoals = null;
	String workoutPlan = null;
	
	public Fitness(String newTitle, Date newStartTime) {
		super(newTitle, newStartTime);
	}
	
	public Fitness(String newTitle, Date newStartTime, String newWeeklyGoals) {
		super(newTitle, newStartTime);
		weeklyGoals = newWeeklyGoals;
	}
	
	public Fitness(String newTitle, Date newStartTime, String newWeeklyGoals, String newWorkoutPlan) {
		super(newTitle, newStartTime);
		weeklyGoals = newWeeklyGoals;
		workoutPlan = newWorkoutPlan;
	}
	
	public String getWeeklyGoals() {
		return weeklyGoals;
	}
	
	public void setWeeklyGoals(String weeklyGoals) {
		this.weeklyGoals = weeklyGoals;
	}
	
	public String getWorkoutPlan() {
		return workoutPlan;
	}
	
	public void setWorkoutPlan(String workoutPlan) {
		this.workoutPlan = workoutPlan;
	}
}
