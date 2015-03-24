import java.util.ArrayList;
import java.util.List;


public class PrimeFactor {

	public static List<Integer> primeFactors(int integer){
		ArrayList<Integer> primes = new ArrayList<>();
		for(;integer % 2 == 0;integer/=2){
			primes.add(2);
		}
		for(;integer % 3 == 0;integer/=3){
			primes.add(3);
		}
		if(integer > 1)
		{
			primes.add(integer);
		}
		return primes;
		}
}
