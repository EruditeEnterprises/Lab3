import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Lab3PrimeNumberTest {
	private int inputNumber;
	private List<Integer> expectedResult;
	
	public Lab3PrimeNumberTest(int inputNumber, List<Integer> expectedResult){
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList( new Object[][] {
			{1, list()},
			{3, list(2)},
			{4, list(2, 3)},
			{5, list(2,3)},
			{10, list(2,3,5,7)},
			{100, list(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97)}
		});
	}
	
	private static List<Integer> list(Integer...integers){
		return Arrays.asList(integers);
	}
	@Test
	public void primeNumberTest() {
		assertEquals(this.expectedResult, PrimeNumber.primesLessThan(this.inputNumber));
	}
}
