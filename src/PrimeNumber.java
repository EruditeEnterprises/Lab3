import java.util.ArrayList;
import java.util.List;


public class PrimeNumber {

	public static List<Integer> primesLessThan(int i){
		ArrayList<Integer> primes = new ArrayList<>();
		for(int j = 2;i>j; j++){
			boolean toAdd = true;
			for(int k = 2; j>k; k++){
				if((j % k == 0) && (j!=k)){
					toAdd = false;
					break;
				}
			}	
			if(toAdd){
				primes.add(j);
			}
		}
		return primes;
	}
}
