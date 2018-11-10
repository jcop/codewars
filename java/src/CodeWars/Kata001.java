package CodeWars;

import java.util.Arrays;

public class Kata001 {
	
  public static String HighAndLow(String numbers) {
	  
	  String [] parts = numbers.split(" ");

	  // array of strings... we sort them, we have a string sort, not numeric
	  // convert strings to int
	  
	  int[] partsAsInt = new int[ parts.length];
	  for( int i = 0; i < parts.length; i++) {
		  partsAsInt[i] = Integer.parseInt(parts[i]);
	  }
	  Arrays.sort(partsAsInt);
	  
	  
    return Integer.toString(partsAsInt[ partsAsInt.length-1 ])  + ' ' + Integer.toString( partsAsInt[0] );
  }
}
