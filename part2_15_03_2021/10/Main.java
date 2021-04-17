import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    private static int sumOrSubtrEltsOfArray(int[] someNums) {
	int result = someNums[0];
	Random rand = new Random();
	boolean choice = true;
	for (int i = 1; i < someNums.length; i++) {
	    choice = rand.nextBoolean();
	    if (choice) {
		result += someNums[i];
	    } else {
		result -= someNums[i];
	    }
	}
	return result;
    }

    public static void main(String[] args) {

	int[] numbers1 = { 1, 6, 23, 8, 4, 8, 3, 7 };
	int hapHazardResult = sumOrSubtrEltsOfArray(numbers1);

	System.out.printf("Original array: %s%n", Arrays.toString(numbers1));
	System.out.printf("After adding/subtracting its elements from " +
			  "eachother at random we got: %d%n", hapHazardResult);
    }
}
