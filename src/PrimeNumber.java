import java.util.ArrayList;
import java.util.List;


public class PrimeNumber {

	public static List<Integer> primesLessThan(int i){
		ArrayList<Integer> primes = new ArrayList<>();
		for(int j = 2;i>j; j++){
			primes.add(j);
		}
		return primes;
	}
}
