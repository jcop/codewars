package CodeWars;

public class Kata009 {
	public static int countBits(int n){
		
		String bString = Integer.toBinaryString( n );
		
		long count = bString.chars().filter(i -> i == '1').count();
		
		return (int) count;
		
		//     return Integer.bitCount(n);

    
	}
}
