import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class NumberFactor {
	
	public static void main(String args[]){
		printFactors(100);
	}
	
	private static void printFactors(int number){
		Set<Set<Integer>> listOfFactors = new HashSet<Set<Integer>>();
		Set<Integer> factors;
		int size = 1;
		
		if(number == 0){
			System.out.println("0 * 0");
		} else if(number == 1){
			System.out.println("1 * 1");
		} else {
			for(int i = number/2; i>0;i--) {
		        int quotient = number % i;
		        
		        if(quotient == 0) {
		            factors = new HashSet<Integer>();
		        	factors.add(i);
		            factors.add(number/i);
		            listOfFactors.add(factors);
		            
			        if(size == listOfFactors.size()){
			        	System.out.println(i + " * " + number/i);
			        	size++;
			        }
		        }

		    }
		}    
	}
}
