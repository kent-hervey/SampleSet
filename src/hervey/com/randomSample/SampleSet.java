package hervey.com.randomSample;

import java.util.HashSet;
import java.util.Random;

public class SampleSet {
	
	
	protected static HashSet <Integer> createSet(int quantityReturned, int max, int min) {
		//creates a set that has number of elements = quantity Returned
		//elements are random with lower bound of min, and upper bound of max

		
		HashSet <Integer> outputSet = new HashSet<Integer>();
		
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		
		int[] array200 =new int[quantityReturned];
		
		while(outputSet.size()<array200.length) {
			Random r = new Random();	
			int output = r.nextInt((max-min)+1)+min;
			outputSet.add(output);
		}
		return outputSet;
	}

}
