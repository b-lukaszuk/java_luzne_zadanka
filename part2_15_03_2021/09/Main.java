import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Integer> randIntsWithoutRepeats(int upto) {
	    ArrayList<Integer> drawnNumbers = new ArrayList<>();
	    Random rand = new Random();
	    int choice = 0;

	    while(drawnNumbers.size() < upto) {
		choice = rand.nextInt(upto);
		if(!drawnNumbers.contains(choice)) {
		    drawnNumbers.add(choice);
		}
	    }
	    return drawnNumbers;
     }

    private static int[] getShuffledCopyOfArray(int[] someNums) {
	int howMany = someNums.length;
	ArrayList<Integer> randIndexes = randIntsWithoutRepeats(howMany);
	int[] shuffledArray = new int[howMany];
	for (int i = 0; i < howMany; i++) {
	    shuffledArray[i] = someNums[randIndexes.get(i)];
	}
	return shuffledArray;
     }

	public static void main(String[] args) {

	    int[] numbers1 = { 1, 6, 23, 8, 4, 8, 3, 7 };
	    int[] shuffledNumbers = getShuffledCopyOfArray(numbers1);

	    System.out.printf("Original array: %s%n",
			      Arrays.toString(numbers1));
	    System.out.printf("Shuffled array: %s%n",
			      Arrays.toString(shuffledNumbers));
	}
}
