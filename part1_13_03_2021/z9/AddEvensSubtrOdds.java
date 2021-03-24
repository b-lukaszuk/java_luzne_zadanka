import java.util.Arrays;

public class AddEvensSubtrOdds {

    private static short[] nums = {1,  6,  23,  8,  4,
				   98,  3,  7,  3,  98,  4,  98};

    private static boolean isEven(short num) {
	return num % 2 == 0;
    }

    private static int addEvensSubtrOdds(short[] numbers) {
	int sumOfEvens = 0;
	int sumOfOdds = 0;

	for (int i = 0; i < numbers.length; i++) {
	    if(isEven(numbers[i])) {
		sumOfEvens += numbers[i];
	    } else {
		sumOfOdds += numbers[i];
	    }
	}
	return sumOfEvens - sumOfOdds;
    }

    public static void main(String[] args) {
	System.out.println("I got an array:");
	System.out.println(Arrays.toString(nums));
	System.out.println("My initial value is 0.");
	System.out.println("While moving through the array");
	System.out.println("I add even numbers to my initial value " +
			   "and I subtract odd numbers from it ");
	System.out.println("In the end I got: " + (addEvensSubtrOdds(nums)));
    }
}
