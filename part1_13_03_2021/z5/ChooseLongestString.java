import java.util.Arrays;

public class ChooseLongestString {

    // I slightly modified the string array that was given
    private static String[] words1 = { "Politechnika1", "Karol",
				       "Adam", "Rogowski",
				       "Politechnika2", "Super", "Weekend"};

    private static String getLongestStrings(String[] words) {
	String result = "";
	for (int i = 0; i < words.length; i++) {
	    if(result.length() == words[i].length()) {
		result += ", " + words[i];
	    } else if(result.length() < words[i].length()) {
		result = words[i];
	    }
	}
	return result;
    }

    public static void main(String[] args) {

	System.out.println("Searching for the longest string in:");
	System.out.println(Arrays.toString(words1));

	System.out.println("The following word(s) is/are found:");
	System.out.println(getLongestStrings(words1));
    }
}


