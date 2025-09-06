package BehavioralDesignPattern.Observer;

public class Follower implements Observer {

	private String followerName;

	public Follower(String followerName) {

		this.followerName = followerName;
	}

	@Override
	public void update(String name, String s) {

		System.out.println(followerName + " in " + name + " dan aldiği tweet= " + s);
	}

	@Override
	public String toString() {
		return followerName;
	}

}
