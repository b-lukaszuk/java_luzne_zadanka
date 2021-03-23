import java.util.Arrays;

public class LeapYear {

    private static short[] years = {1974, 1900, 1985, 2000};

    private static boolean isLeap(short year) {
	if (year % 4 != 0) {
	    return false;
	} else if(year % 25 != 0) {
	    return true; 
	} else if(year % 16 != 0) {
	    return false;
	} else {
	    return true;
	}
    }

    private static void printLeapYears(short[] maybeLeapYrs) {
	System.out.println("Searching for leap years in:");
	System.out.println(Arrays.toString(maybeLeapYrs));
	System.out.println("The result:");

	byte numOfLeapYears = 0;

	for (int i = 0; i < maybeLeapYrs.length; i++) {
	    if(isLeap(maybeLeapYrs[i])) {
		System.out.println(maybeLeapYrs[i]);
		numOfLeapYears++;
	    }
	}

	System.out.println("Done: " + String.valueOf(numOfLeapYears) +
			   " leap year(s) found");
    }

    
    public static void main(String[] args) {

	printLeapYears(years);
    }
}
