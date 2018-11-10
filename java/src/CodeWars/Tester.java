package CodeWars;

public class Tester {

	public static void main(String[] args) {
		
		System.out.print("CodeWars Tester Begin testing\n");
		//HighAndLow();
		//Kata003Test();
		//Kata004Test();
		//Kata006Test();
		//Kata007Test();
		Kata010.testMe();

				
		System.out.print("Finished testing!\n");
	}


	public static void Kata007Test( ) {
		
		int [] input = new int[] {20,37,20,21};
		int[] result1 = Kata007.deleteNth( input, 0 );
		System.out.println("Got here ___" );

		// return [20,37,21]
		
		input = new int[] {20,37,20,21};
		result1 = Kata007.deleteNth( input, 1 );
		System.out.println("Got here ___" );

		// return [20,37,21]
		
		result1 = Kata007.deleteNth( new int[] {1,1,3,3,7,2,2,2,2}, 3);
		System.out.println("Got result___" + result1 + "___" );

		// return [1, 1, 3, 3, 7, 2, 2, 2]
	}
	
	public static void Kata006Test( ) {
		
		String result1 = Kata006.SongDecoder( "WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB" );
		System.out.println("Got result___" + result1 + "___" );

	}
	public static void Kata004Test( ) {
		
		long inVar = 121;
		long result1 = Kata004.findNextSquare( inVar );
		System.out.println("IN:" + inVar + " Got result " + result1 );
		
		inVar = 625;
		result1 = Kata004.findNextSquare( inVar );
		System.out.println("IN:" + inVar + " Got result " + result1 );
		
		inVar = 114;
		result1 = Kata004.findNextSquare( inVar );
		System.out.println("IN:" + inVar + " Got result " + result1 );

	}
	
	
	public static void Kata003Test() {
		
		// empty array
		//int[] result = Kata003.sortArray( new int[0] );
		//System.out.print("Result empty array: " + result.toString() + "\n");
		int[] inputArray = new int[] {5, 0, 3, 2, 8, 1, 4};
		int[] result2 = Kata003.sortArray( inputArray );
		// expected: [1, 0, 3, 2, 8, 5, 4]
		System.out.print("Result example array: " + result2.toString() + "\n");
	}

	public static void HighAndLow() {
		String result = Kata001.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
		System.out.print("Result: " + result + "\n");

		result = Kata001.HighAndLow("8");
		System.out.print("Result: " + result + "\n");

		return;
	}
	
	
	
	
}
