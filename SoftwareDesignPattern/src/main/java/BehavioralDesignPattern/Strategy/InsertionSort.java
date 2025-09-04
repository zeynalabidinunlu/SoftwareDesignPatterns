package BehavioralDesignPattern.Strategy;

import java.util.Arrays;

public class InsertionSort implements SortingStrategy{

	@Override
	public void sort(int[] myarray) {

		System.out.println("Inseriton Sort Strategy");
		for (int i = 1; i < myarray.length; i++) {
			int temp= myarray[i];
			int j;
			for ( j = i-1; (j>=0)&&(myarray[j])>temp; j--) {
					
				myarray[j+1]= myarray[j];
			}
			myarray[j+1]= temp;

		}
		System.out.println(Arrays.toString(myarray));
	}

}
