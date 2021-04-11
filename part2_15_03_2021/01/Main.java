import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		int[] numbers = { 1, 6, 23, 8, 4, 8, 3, 7 };
		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}

		System.out.println("Sum of an array: " +
				   Arrays.toString(numbers) +
				   " elements is: " + String.valueOf(sum));
	}
}
