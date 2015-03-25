import java.util.ArrayList;
import java.util.List;


public class PrimeNumber {

	public static List<Integer> primesLessThan(int i){
		ArrayList<Integer> primes = new ArrayList<>();
		for(int j = 2;i>j; j++){
			if((j % 2 == 0) && (j!=2)){
				continue;
			}
			primes.add(j);
		}
		return primes;
	}
}
