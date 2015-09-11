public class MinimumSubstring {
	
	public String findMinSubstring(String sourceString, String targetString){
		int sourceLength = sourceString.length();
		int targetLength = targetString.length();
		char[] source = sourceString.toCharArray();
		char[] target = targetString.toCharArray();
		int[] needToFind = new int[256];
		int minWindowBegin = 0;
		int minWindowEnd = 0;
		int[] hasFound = new int[256];
		int minWindowLength = Integer.MAX_VALUE;	
		int count = 0;
		
		for(int i = 0; i < targetLength; i++){
			needToFind[target[i]]++;
		}
		
		for (int begin = 0, end = 0; end < sourceLength; end++) {
		    // skip characters not in T
		    if (needToFind[source[end]] == 0)
		    	continue;
		    hasFound[source[end]]++;
		    if (hasFound[source[end]] <= needToFind[source[end]])
		      count++;
		 
		    // if window constraint is satisfied
		    if (count == targetLength) {
		      // advance begin index as far right as possible,
		      // stop when advancing breaks window constraint.
		      while (needToFind[source[begin]] == 0 || hasFound[source[begin]] > needToFind[source[begin]]) {
		        if (hasFound[source[begin]] > needToFind[source[begin]])
		          hasFound[source[begin]]--;
		        begin++;
		      }
		 
		      // update minWindow if a minimum length is met
		      int windowLength = end - begin + 1;
		      if (windowLength < minWindowLength) {
		        minWindowBegin = begin;
		        minWindowEnd = end;
		        minWindowLength = windowLength;
		      } // end if
		    } // end if
		  } // end for
		
		if(count == targetLength){
			return sourceString.substring(minWindowBegin,minWindowEnd+1);
		} else {
			return "";
		}
		 
		  
	}
}
