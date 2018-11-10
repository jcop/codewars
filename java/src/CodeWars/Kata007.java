package CodeWars;
/*
 Given a list lst and a number N, create a new list that contains 
 each number of lst at most N times without reordering. 
 
 For example 
 	if N = 2, and the 
 	input is [1,2,3,1,2,1,2,3], 
 	
 	you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 
 	being in the result 3 times, and then take 3, 
 	
 	which leads to [1,2,3,1,2,3].
 	
 	
 	EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
E	EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
 */

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class Kata007 {

	public static int[] deleteNth(int[] elements, int maxOcurrences) {
		
		if ( maxOcurrences == 0 ) {
			// no need to complicate things, return empty array
			return new int [0];
		}
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
	    ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i : elements) {
			
			if ( !counts.containsKey(i) ) {
			   counts.put(i, 1);
			   al.add( i );
			   continue;
			}
			   
			int occurrence = counts.get(i);
			   
			if ( occurrence >= maxOcurrences ) {
				// skip this entry, already overflowed
				continue;
			}
			occurrence++;
            counts.put(i, occurrence);
            al.add( i );
		}		
		
		int [] toReturn = al.stream()
				 .mapToInt( (i) -> i)
				 .toArray();
		
		System.out.println("bela");
		return toReturn;
		
		
		/*/Output the results
		for (int i : counts.keySet()) {
		   System.out.println(i+":"+counts.get(i));
		}
		*/
		
	
		
		/* TOO agressive, removes all ocorrences 
		 *  int[] finalResult = Arrays.stream( elements )
								.filter( i -> ( counts.get(i) <=  maxOcurrences) )
								.toArray();
		*/

		
		
		/*
		
		
		
		String[] array = {"name1","name2","name3","name4", "name5", "name2"};

		Arrays.stream(array)
	      .collect(Collectors.groupingBy(s -> s))
	      .forEach((k, v) -> System.out.println(k+" "+v.size()));
		
		
		Map<String, Long> map = Arrays.stream(elements)
			    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		
		return null;
		
		
		  int[] oddNumbers = Arrays.stream( array ).filter( i -> ( (i != 0) && ( i%2 != 0 )  ) ).toArray();
		  Arrays.sort( oddNumbers );
		  */
	}
	
	
}
