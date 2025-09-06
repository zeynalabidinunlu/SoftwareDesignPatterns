package CreationalDesignPattern.Prototype;

public class TestPrototypePattern {

	public static void main(String[] args) {

		AccessControl userAccessControl = AccesControlProvider.getAccessControlObject("USER");
		User user = new User("User A", "USER Level", userAccessControl);
		System.out.println("***************************************");
		System.out.println(user);
		
		
		userAccessControl= AccesControlProvider.getAccessControlObject("USER");
		user= new User("User B", "USER Level", userAccessControl);
		user.getAccessControl().setAccess("READ REPORTS");
		System.out.println(user);
		
		
		System.out.println("****************************************");
		AccessControl managerAccessControl= AccesControlProvider.getAccessControlObject("MANAGER");
		user =  new User("User C", "MANAGER LEVEL", managerAccessControl);
		System.out.println(user);
	}

}
