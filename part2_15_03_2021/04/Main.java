import java.util.Arrays;

public class Main {

	private static int[] reverseArray(int[] nums) {
		int[] revArr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			revArr[i] = nums[nums.length - 1 - i];
		}
		return revArr;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 6, 23, 8, 4, 8, 3, 7 };
		int[] revNumbers = reverseArray(numbers);

		System.out.println("Original array: " +
				   Arrays.toString(numbers));
		System.out.println("Reversed array: " +
				   Arrays.toString(revNumbers));
	}
}
