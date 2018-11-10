package CodeWars;


/*
You are given an array (which will have a length of at least 3, but could be very large) 
containing integers. 
The array is either entirely comprised of odd integers or entirely comprised of even integers
 except for a single integer N. 
 
 Write a method that takes the array as an argument and returns this "outlier" N.

[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)

*/
import java.util.Arrays;
import Common.Utils;

public class Kata010 {

	  static int find(int[] integers) {
		  
		  // check to see if looking for odd, or even
		  Utils.printArray( integers );
		  
		  int sumOf = Math.abs(integers[0] % 2) + Math.abs(integers[1] % 2) + Math.abs(integers[2] % 2);
		  
		  int expectedMod;
		  if ( sumOf == 0 || sumOf == 1) {
			  expectedMod = 1;
		  }
		  else {
			  expectedMod = 0;
		  }
		  System.out.println("Looking for " + (expectedMod == 0 ? "PAIR" : "ODD" ));
		    		
		  int toReturn = Arrays.stream( integers )
				  	.filter( i -> ( Math.abs(i % 2) == expectedMod ) )
				  	.findFirst()
				  	.orElse(0);
		  
		  System.out.println("ai jesus, ta quase!");

		  return toReturn;
		}
	  
	  public static void testMe( ) {
			
		  int result;
		  	
		  result = Kata010.find(  new int[] {-2147483647, -18, 6, -8, -10, 6, 12, -24, 36});
		  System.out.println("Got here ___ with: " + result ); // -2147483647
		  
		  result = Kata010.find(  new int[] { 17, 6, 8, 10, 6, 12, 24, 36} );
		  System.out.println("Got here ___ with: " + result ); // 17
			
			return;
			
			/*
		
			 	int [] input = new int[] { 2, -6, 8, -10, -3 };
			int result1 = Kata010.find( input );
			System.out.println("Got here ___ with: " + result1 ); // -3
		
		
		
			
			
			input = new int[] {2, 4, 0, 100, 4, 11, 2602, 36};
			result1 = Kata010.find( input );
			System.out.println("Got here ___ with: " + result1 ); // 11
			
			input = new int[] {160, 3, 1719, 19, 11, 13, -21};
			result1 = Kata010.find( input );
			System.out.println("Got here ___ with: " + result1 ); // 160 
	*/
		}
	  
	  static int findFirstAttempt(int[] integers) {
		  
		  // check to see if looking for odd, or even
		  Utils.printArray( integers );
		  boolean firstIsEven = ( integers[0] % 2 == 0 ? true : false);
		  boolean secIsEven   = ( integers[1] % 2 == 0 ? true : false);
		  boolean thirdIsEven = ( integers[2] % 2 == 0 ? true : false);

		  //17, 6, 8,
		  //160, 3, 1719
		  
		  int expectedMod;
		  if ( firstIsEven && secIsEven && thirdIsEven) {
			  // looking for odd
			  System.out.println("Looking for ODD");
			  expectedMod = 1;
			  
		  }
		  else if (  !firstIsEven && !secIsEven && !thirdIsEven ) {
			  // looking for even
			  System.out.println("Looking for EVEN");
			  expectedMod = 0;
		  }
		  else {
			  // oops, found it already!!!
			  if ( (firstIsEven && thirdIsEven)|| (!firstIsEven && !thirdIsEven)) {
				  System.out.println("second position!");
				  return integers[1];
			  }
			  else if ( (secIsEven && thirdIsEven) || (!secIsEven && !thirdIsEven)){
				  System.out.println("first position!");
				  return integers[0];
			  }
			  else {
				  System.out.println("3rd position!");

				  return integers[2];
				  
			  }
		  }		  
		
		  System.out.print("<br>oi???test<br>");
		  int toReturn = Arrays.stream( integers )
				  	.filter( i -> ( Math.abs(i % 2) == expectedMod ) )
				  	.findFirst()
				  	.orElse(0);
		  
		  System.out.println("ai jesus, ta quase!");

		  return toReturn;
		}
}



/*
 * 
 *
 *     public static int find(int[] integers) {
        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
 * 
 * 
*/