import java.util.Arrays;
import java.util.Random;

public class Main {

    // draw numbers with replacement
    private static int[] drawNRandElts (int howManyElts,
					int[] arrToDrawFrom) {
	int[] result = new int[howManyElts];
	int drawnIndex = 0;
	Random rand = new Random();

	for (int i = 0; i < howManyElts; i++) {
	    drawnIndex = rand.nextInt(arrToDrawFrom.length);
	    result[i] = arrToDrawFrom[drawnIndex];
	}

	return result;
     }

    private static int getMin(int[] someArr) {
	int min = someArr[0];
	for (int i = 1; i < someArr.length; i++) {
	    if(someArr[i] < min) {
		min = someArr[i];
	    }
	}
	return min;
     }

	public static void main(String[] args) {

		int[] numbers1 = { 1, 6, 23, 8, 4, 8, 3, 7 };
		int howMany = 4;
		int[] numbers2 = drawNRandElts(howMany, numbers1);
		int minOfNumbers2 = getMin(numbers2);

		System.out.println("Original array: " +
				   Arrays.toString(numbers1));
		System.out.println(String.valueOf(howMany) +
				   " random elts from the original array " +
				   "(drawn with replacement): " +
				   Arrays.toString(numbers2));
		System.out.println("Min value from array of randoms: " +
				   String.valueOf(minOfNumbers2));
	}
}
