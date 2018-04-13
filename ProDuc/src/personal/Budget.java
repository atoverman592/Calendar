package personal;

import java.io.Serializable;
import java.util.Date;

import calendar.Event;

public class Budget extends Event implements Serializable{
	String currentBudget = null;
	String currentExpenses = null;
	String amountRemaining = null;
	
	public Budget(String newTitle, Date newStartTime) {
		super(newTitle, newStartTime); 
	}
	
	public Budget(String newTitle, Date newStartTime, String newCurrentBudget) {
		super(newTitle, newStartTime);
		currentBudget = newCurrentBudget;
	}
	
	public Budget(String newTitle, Date newStartTime, String newCurrentBudget, String newCurrentExpenses) {
		super(newTitle, newStartTime);
		currentBudget = newCurrentBudget;
		currentExpenses = newCurrentExpenses;
	}
	
	public Budget(String newTitle, Date newStartTime, String newCurrentBudget, String newCurrentExpenses, String newAmountRemaining) {
		super(newTitle, newStartTime);
		currentBudget = newCurrentBudget;
		currentExpenses = newCurrentExpenses;
		amountRemaining = newAmountRemaining; 
	}
	
	public String getCurrentBudget() {
		return currentBudget;
	}
	
	public void setBudget(String currentBudget) {
		this.currentBudget = currentBudget;
	}
	
	public String getCurrentExpenses() {
		return currentExpenses;
	}
	
	public void setExpenses(String currentExpenses) {
		this.currentExpenses = currentExpenses;
	}
	
	public String getAmountRemaining() {
		return amountRemaining;
	}
	
	public void setRemaining(String amountRemaining) {
		this.amountRemaining = amountRemaining; 
	}
}