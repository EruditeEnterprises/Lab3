import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


public class Lab3Test {
	public ArrayList<Integer> list =new ArrayList<>();
	@Test
	public void testPrimeFactorsForOne() {
		assertEquals(this.list, primeFactors(1));
	}
	
	@Test
	public void testPrimeFactorsForTwo() {
		this.list.add(2);
		assertEquals(this.list, primeFactors(2));
		this.list.clear();
	}

	public ArrayList<Integer> primeFactors(int integer){
		return new ArrayList<Integer>();
	}
}
