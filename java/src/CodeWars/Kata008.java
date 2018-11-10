package CodeWars;

/*
 x Simple, given a string of words, return the length of the shortest word(s).
 
 String will never be empty and you do not need to account for different data types.
*/

public class Kata008 {

    public static int findShort(String s) {
        
    	  String [] parts = s.split(" ");

  	  // array of strings... we sort them, we have a string sort, not numeric
  	  // convert strings to int
  	  
  	  int currentShortest = Integer.MAX_VALUE;
  	  for( int i = 0; i < parts.length; i++) {
  		  
  		  if ( parts[i].length() < currentShortest ) {
  			  currentShortest = parts[i].length();	  
  		  }
  		  
  	  }
  	  return currentShortest;
    }
    
}

/*
         return Stream.of(s.split(" "))
          .mapToInt(String::length)
          .min()
          .getAsInt();
 */