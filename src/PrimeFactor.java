import java.util.ArrayList;
import java.util.List;


public class PrimeFactor {

	public static List<Integer> primeFactors(int i){
		ArrayList<Integer> primes = new ArrayList<>();
		for(int j = 2; i>1; j++){
			for(;i % j == 0;i/=j){
				primes.add(j);
			}
		}
		return primes;
		}
}
