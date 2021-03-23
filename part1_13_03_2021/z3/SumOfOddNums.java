import java.util.Arrays;

public class SumOfOddNums {
    private static short[] nums = {1,  6,  23,  8,  4,
				   98,  3,  7,  3,  98,  4,  98};

    private static boolean isOdd(short num) {
	return num % 2 == 1;
    }

    private static int sumOddNums(short[] nums) {
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
	    if(isOdd(nums[i])) {
		sum += nums[i];
	    }
	}
	return sum;
    }

    public static void main(String[] args) {

	System.out.println("The sum of odd numbers in " +
			   Arrays.toString(nums) + " is equal to " +
			   sumOddNums(nums));
    }
}
