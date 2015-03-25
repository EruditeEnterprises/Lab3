import java.util.ArrayList;
import java.util.List;


public class PrimeNumber {

	public static List<Integer> primesLessThan(int i){
		ArrayList<Integer> primes = new ArrayList<>();
		if(i>2){
			primes.add(2);
		}
		return primes;
	}
}
