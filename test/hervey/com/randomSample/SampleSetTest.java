package hervey.com.randomSample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SampleSetTest {

	@Test
	public void checkGoodQuantityReturned() {
		//fail("Not yet implemented");
		int quantityWanted = 20;
		int max =50;
		int min =1;
		System.out.println("size is " + SampleSet.createSet(quantityWanted, max, min).size());
		assertEquals(20, SampleSet.createSet(quantityWanted, max, min).size());
	}

}
