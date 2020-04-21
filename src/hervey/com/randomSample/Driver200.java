package hervey.com.randomSample;
import java.util.HashSet;
import java.util.Random;

public class Driver200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int quantityNumbersNeeded =200; //will be 200
		int maxValueNumbers=1000; //will be 1000
		int minValueNumbers=1;
		
		HashSet <Integer> createdSet = SampleSet.createSet(quantityNumbersNeeded, maxValueNumbers, minValueNumbers);
		
		System.out.println("resulting set of quantity " + quantityNumbersNeeded + " ranging from " + minValueNumbers + " to " + maxValueNumbers + " is \n" + createdSet.toString());
		
	}



}
