package Common;

public class Utils {

		public static void printArray(int[] anArray) {
			for (int i = 0; i < anArray.length; i++) {
				if (i > 0) {
					System.out.print(", ");
				}
				System.out.print(anArray[i]);
			}
			System.out.print("\n");
		}
}
