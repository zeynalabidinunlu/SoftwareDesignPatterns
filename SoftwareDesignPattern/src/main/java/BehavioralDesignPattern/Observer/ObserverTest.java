package BehavioralDesignPattern.Observer;

public class ObserverTest {

	public static void main(String[] args) {
		Celebrity unlu1= new Celebrity("Ünlü 1");
		Celebrity unlu2= new Celebrity("Ünlü 2");
		
		
		Follower takipci1= new Follower("Hasan");
		Follower takipci2= new Follower("Enes");
		Follower takipci3= new Follower("Kobi");
		Follower takipci4= new Follower("Batuhan");
		Follower takipci5= new Follower("Ali");
		Follower takipci6= new Follower("Fevzi");

		unlu1.register(takipci1);
		unlu1.register(takipci2);
		unlu1.register(takipci3);
		
		unlu2.register(takipci4);
		unlu2.register(takipci6);
		unlu2.register(takipci5);
	
		unlu1.tweet("Yeni fotomu beğendiniz mi ?");
		unlu2.tweet("İyi Sabahlar !!");
	
		unlu1.unregister(takipci2);
		unlu1.tweet("DENEMEEEEEEEEEEEEEEE");
	}
}
