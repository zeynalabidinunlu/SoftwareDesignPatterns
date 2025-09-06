package BehavioralDesignPattern.Observer;

import java.util.ArrayList;

public class Celebrity implements Subject {

	public Celebrity(String celebrityName ){
		this.celebrityName = celebrityName;
		this.followers = new ArrayList<Observer>();
	}
	private String celebrityName;
	private ArrayList<Observer> followers;
	
	@Override
	public void register(Observer o) {
		followers.add(o);
		System.out.println(o+" "+celebrityName+" i takip ediyor");
	}
	@Override
	public void unregister(Observer o) {
		followers.remove(o);
		System.out.println(o+" "+celebrityName+" i takibi bıraktı");
		
	}
	
	@Override
	public void notifyAllObservers(String s) {
		
		for (Observer follower : followers) {
			follower.update(celebrityName,s);
		}
		System.out.println();
		
	}
	
	public void tweet(String tweet) {
		System.out.println("\n"+celebrityName+"in gönderdiği tweet = ");
		notifyAllObservers(tweet);
	}

}
