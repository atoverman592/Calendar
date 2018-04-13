package groups;

import java.io.Serializable;

public class Group implements Serializable{
		String groupName = null;
		String groupDescription = null; 

		public Group(String newGroupName) {
			groupName = newGroupName;
		}
		
		public Group(String newGroupName, String newGroupDescription) {
			groupName = newGroupName;
			groupDescription = newGroupDescription;
		}
		
		public String getGroupName() {
			return groupName;
		}
		
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		
		public String getGroupDescription() {
			return groupDescription;
		}
		
		public void setGroupDescription(String groupDescription) {
			this.groupDescription = groupDescription;
		}
}