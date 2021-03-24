import java.util.Arrays;

public class ChooseIndexesOfMax {

    private static short[] nums = {1,  6,  23,  8,  4,
				   98,  3,  7,  3,  98,  4,  98};

    private static String chooseIndsOfMax(short[] arr) {
	short maxVal = arr[0];
	String indsOfMax = "0";
	for (short i = 1; i < arr.length; i++) {
	    if (arr[i] > maxVal) {
		maxVal = arr[i];
		indsOfMax = String.valueOf(i);
	    } else if(arr[i] == maxVal) {
		indsOfMax += (", " + String.valueOf(i));
	    }
	}
	return indsOfMax;
    }

    public static void main(String[] args) {
	System.out.println("Searching for index/indicies of Max in:");
	System.out.println(Arrays.toString(nums));
	System.out.println("Done. Max value is found at index/indices " +
			   "(0 based):");
	System.out.println(chooseIndsOfMax(nums));
    }
}
