package BehavioralDesignPattern.Strategy;

public class TestStrategy {

	public static void main(String[] args) {

		int numbers[] = {1,42,31,12,213,231,41,43,312,19};
		
		SortingContext context= new SortingContext();
		context.setSortingMethod(new InsertionSort());
		context.sortNumbers(numbers);
		
		System.out.println("\n-------------------------\n");
		context.setSortingMethod(new SelectionSort());
		context.sortNumbers(numbers);
		System.out.println("\n---------------------------\n");
	}

}
