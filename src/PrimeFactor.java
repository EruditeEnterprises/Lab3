import java.util.ArrayList;


public class PrimeFactor {

	public static ArrayList<Integer> primeFactors(int integer){
		if(integer == 1)
		{
			return new ArrayList<>();
		}
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(integer);
		return newList;
		}
}
