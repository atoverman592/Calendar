package personal;

import java.io.Serializable;
import java.util.ArrayList;

public class Notes implements Serializable{
	String noteTitle = null;
	String noteText = null;
	//ArrayList<Notes> noteList; 
	
/*	public Notes() {
		noteList =  new ArrayList<Notes>(); 
	}*/
	
	public Notes(String newNoteTitle, String newNoteText) {
		noteTitle = newNoteTitle;
		noteText = newNoteText;
	}
	
	public String getTitle() {
		return noteTitle;
	}
	
	public void setTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	
	public String getNote() {
		return noteText;
	}
	
	public void setNote(String noteText) {
		this.noteText = noteText;
	}
	
}