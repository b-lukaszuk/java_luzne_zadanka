import java.util.Arrays;

public class CalcAvgAtEvenIndexes {

    private static short[] nums = {1,  6,  23,  8,  4,
				   98,  3,  7,  3,  98,  4,  98};

    private static boolean isEven(short num) {
	return num % 2 == 0;
    }

    private static double calcAvgAtEvenIndexes(short[] numbers) {
	float sum = 0;
	short noOfEvenInds = 0;

	// "Zero is not considered to be even number."
	for (short i = 2; i < numbers.length; i++) {
	    if(isEven(i)) {
		sum += numbers[i];
		noOfEvenInds++;
	    }
	}
	return sum/noOfEvenInds;
    }

    public static void main(String[] args) {
	System.out.println("Counting the average of items at even indicies, for:");
	System.out.println(Arrays.toString(nums));
	System.out.println("Index starts at 0, " +
			   "but 0 is not considered to be an even number");
	System.out.printf("The average is: %.3f%n", calcAvgAtEvenIndexes(nums));
    }
}
