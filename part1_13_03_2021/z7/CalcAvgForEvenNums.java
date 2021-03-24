import java.util.Arrays;

public class CalcAvgForEvenNums {

    private static short[] nums = {1,  6,  23,  8,  4,
				   98,  3,  7,  3,  98,  4,  98};

    private static boolean isEven(short num) {
	return num % 2 == 0;
     }

    private static double calcAvgForEvenNums(short[] numbers) {
	float sum = 0;
	short noOfEvens = 0;

	for (int i = 0; i < numbers.length; i++) {
	    if(isEven(numbers[i])) {
		sum += numbers[i];
		noOfEvens++;
	    }
	}
	return sum/noOfEvens;
     }

    public static void main(String[] args) {
	System.out.println("Counting the average of even numbers in:");
	System.out.println(Arrays.toString(nums));
	System.out.printf("The average is: %.3f%n", calcAvgForEvenNums(nums));
    }
}
