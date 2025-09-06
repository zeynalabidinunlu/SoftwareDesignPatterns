package CreationalDesignPattern.Prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

	private String userName;
	private String level;
	private AccessControl accessControl;

	public User(String userName, String level, AccessControl accessControl) {
		this.accessControl = accessControl;
		this.level = level;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Name" + userName + ", Level" + level + ", Access Control Level:" + accessControl.getControlLevel()
				+ ", Access: " + accessControl.getAccess();
	}

}
