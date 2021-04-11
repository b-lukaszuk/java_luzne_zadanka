import java.util.Arrays;

public class Main {
	private static int[] minAndMax(int[] anArray) {
		int[] minAndMax = { anArray[0], anArray[0] };
		for (int i = 1; i < anArray.length; i++) {
			if (anArray[i] < minAndMax[0]) {
				minAndMax[0] = anArray[i];
			}
			if (anArray[i] > minAndMax[1]) {
				minAndMax[1] = anArray[i];
			}
		}
		return minAndMax;
	}

	public static void main(String[] args) {

		int[] numbers = { 1, 6, 23, 8, 4, 8, 3, 7 };
		int[] minAndMax = minAndMax(numbers);

		System.out.printf("Min and Max from the array: %s " +
				  "are %d and %d%n",
				  Arrays.toString(numbers),
				  minAndMax[0],
				  minAndMax[1]);
	}
}
