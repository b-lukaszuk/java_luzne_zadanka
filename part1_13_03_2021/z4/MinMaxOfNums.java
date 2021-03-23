import java.util.Arrays;

public class MinMaxOfNums {

    private static short[] nums = {1,  6,  23,  8,  4,
				   98,  3,  7,  3,  98,  4,  98};

    private static short[] getMinMaxFromArray(short[] nums) {

	short[] minAndMax = {nums[0], nums[0]};

	for (int i = 1; i < nums.length; i++) {
	    if(nums[i] < minAndMax[0]) {
		minAndMax[0] = nums[i];
	    }
	    if(nums[i] > minAndMax[1]) {
		minAndMax[1] = nums[i];
	    }
	}
	return minAndMax;
    }

    public static void main(String[] args) {

	System.out.println("Searching for min and max in: " +
			   Arrays.toString(nums));

	System.out.println("Values found [min-max]: " +
			   Arrays.toString(getMinMaxFromArray(nums)));

    }
}
