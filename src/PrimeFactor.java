import java.util.ArrayList;
import java.util.List;


public class PrimeFactor {

	public static List<Integer> primeFactors(int integer){
		ArrayList<Integer> primes = new ArrayList<>();
		while(integer % 2 == 0){
			primes.add(2);
			integer/=2;
		}
		if(integer > 1)
		{
			primes.add(integer);
		}
		return primes;
		}
}
