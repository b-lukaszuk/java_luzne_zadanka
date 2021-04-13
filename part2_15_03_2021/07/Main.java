import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { 1, 6, 23, 8, 4, 8, 3, 7 };

		Random rand = new Random();
		int randInd = rand.nextInt(numbers.length);

		System.out.println("Original array: " +
				   Arrays.toString(numbers));
		System.out.println("Random elt from the array: " +
				   String.valueOf(numbers[randInd]));
	}
}
