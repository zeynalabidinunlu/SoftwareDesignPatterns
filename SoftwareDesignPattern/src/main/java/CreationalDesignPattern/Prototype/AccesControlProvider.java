package CreationalDesignPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class AccesControlProvider {

	private static Map<String, AccessControl> map = new HashMap<String, AccessControl>();
	static {
		System.out.println("FETCİHNG DATA from external resources and creating access control objects");
		map.put("USER", new AccessControl("USER", "DD_WORK"));
		map.put("ADMIN", new AccessControl("ADMIN", "ADD/REMOVE USERS"));
		map.put("MANAGER", new AccessControl("MANAGER", "GENERATE/READ REPORTS"));
		map.put("VP", new AccessControl("VP", "MODIFY REPORTS"));
	}

	public static AccessControl getAccessControlObject(String controlLevel) {
		AccessControl accessControl = null;
		accessControl = map.get(controlLevel);
		if (accessControl != null) {
			return accessControl.clone();
		}
		return null;
	}
}
