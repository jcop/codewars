package CodeWars;

/*
 You have an array of numbers.
Your task is to sort ascending odd numbers but even numbers must be on their places.

Zero isn't an odd number and you don't need to move it. 
If you have an empty array, you need to return it.
ex:
 sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]

 */

import java.util.Arrays;
//import java.util.*;

public class Kata003 {

	  public static int[] sortArray(int[] array) {
		  
		  //empty?, return it
		  if ( array.length-1 == 0 ) {
			  return array;
		  }
		  
		  // get odd elements, sort them
		  int[] oddNumbers = Arrays.stream( array ).filter( i -> ( (i != 0) && ( i%2 != 0 )  ) ).toArray();
		  Arrays.sort( oddNumbers );
		  
		  // iterate input array, use sorted odd array to fill
		  // odd elements, skip even/zero elements
		  //int oddIndex = oddNumbers.length-1; // this for reversed list, oddIndexx-- in loop
		  int oddIndex = 0;
		  
		  for( int i = 0; i < array.length; i++) {
			  System.out.print( i + "com valor: " + array[ i ] + " odd index is " + oddIndex +  "\n" );

			  if( array[ i ] % 2 == 0) {
				  continue;
			  }
			  System.out.print( "changing: " + i + "com valor: " + array[ i ] + "por "  + oddNumbers[ oddIndex ] +"\n" );
			  array[ i ] = oddNumbers[ oddIndex++ ];
		  }
		  		  
		    return array;
	  }
	
}

/*
 		  //int[] numbers = { -1, 0, 1, 2 };
		  //int[] filteredNumbers = Arrays.stream( numbers ).filter( i -> i > 0 ).toArray();
			 // java has no reverse method for primitives???
		  for (int left=0, right=oddNumbers.length-1; left<right; left++, right--) {
			    // exchange the first and last
			    int temp = oddNumbers[left]; 
			    oddNumbers[left]  = oddNumbers[right];
			    oddNumbers[right] = temp;
			}	   
		   
 * 
 * 
 * 
 public class Kata {
  public static boolean isOdd(final int n) {
    return n % 2 != 0;
  }
  
  public static int[] sortArray(final int[] array) {
    final Iterator<Integer> sortedOdds = IntStream.of(array)
        .filter(Kata::isOdd)
        .sorted()
        .iterator();
    return IntStream.of(array)
        .map(n -> isOdd(n) ? sortedOdds.next() : n)
        .toArray();
  }
}

 */


