import java.util.Arrays;

public class Main {

    private static int[] sumOfPairs(int[] nums) {

	boolean isLenOdd = (nums.length % 2 == 1);
	int resultLen = isLenOdd ? (int) (nums.length/2+1) : nums.length/2;
	int[] result = new int[resultLen];

	for (int i = 0; i < result.length; i++) {
	    if(isLenOdd && (i == (resultLen - 1))) {
		result[i] = nums[i*2] + 0;
	    } else {
		result[i] = nums[i*2] + nums[i*2+1];
	    }
	}

	return result;
     }

	public static void main(String[] args) {

		int[] numbers = { 1, 6, 23, 8, 4, 8, 3, 7 };
		int[] numsAddedByPairs = sumOfPairs(numbers);

		System.out.println("Original array: " +
				   Arrays.toString(numbers));
		System.out.println("After adding numbers in pairs: " +
				   Arrays.toString(numsAddedByPairs));

		System.out.printf("===%n");

		int[] numbers2 = { 1, 6, 23, 8, 4, 8, 3 };
		int[] numsAddedByPairs2 = sumOfPairs(numbers2);

		System.out.println("Original array: " +
				   Arrays.toString(numbers2));
		System.out.println("After adding numbers in pairs: " +
				   Arrays.toString(numsAddedByPairs2));
	}
}
