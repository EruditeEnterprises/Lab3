import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


public class Lab3Test {
	public ArrayList<Integer> list =new ArrayList<>();
	@Test
	public void testPrimeFactorsForOne() {
		assertEquals(this.list, PrimeFactor.primeFactors(1));
	}
	
	@Test
	public void testPrimeFactorsForTwo() {
		this.list.add(2);
		assertEquals(this.list, PrimeFactor.primeFactors(2));
		this.list.clear();
	}
	
	@Test
	public void testPrimeFactorsForThree() {
		this.list.add(3);
		assertEquals(this.list, PrimeFactor.primeFactors(3));
		this.list.clear();
	}
	@Test
	public void testPrimeFactorsForFour() {
		this.list.add(2);
		this.list.add(2);
		assertEquals(this.list, PrimeFactor.primeFactors(4));
		this.list.clear();
	}

}
