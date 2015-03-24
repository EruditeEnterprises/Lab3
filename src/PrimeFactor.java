import java.util.ArrayList;
import java.util.List;


public class PrimeFactor {

	public static List<Integer> primeFactors(int integer){
		ArrayList<Integer> newList = new ArrayList<>();
		if(integer > 1)
		{
			newList.add(integer);
		}
		return newList;
		}
}
