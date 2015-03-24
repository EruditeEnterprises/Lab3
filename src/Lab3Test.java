import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class Lab3Test {
	private List<Integer> list(Integer...integers){
		return Arrays.asList(integers);
	}
	@Test
	public void testPrimeFactorsForOne() {
		assertEquals(list(), PrimeFactor.primeFactors(1));
	}
	
	@Test
	public void testPrimeFactorsForTwo() {
		assertEquals(list(2), PrimeFactor.primeFactors(2));
	}
	
	@Test
	public void testPrimeFactorsForThree() {
		assertEquals(list(3), PrimeFactor.primeFactors(3));
	}
	@Test
	public void testPrimeFactorsForFour() {
		assertEquals(list(2,2), PrimeFactor.primeFactors(4));
	}
	
	@Test
	public void testPrimeFactorsForSix() {
		assertEquals(list(2,3), PrimeFactor.primeFactors(6));
	}

}
