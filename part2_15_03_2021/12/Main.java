import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Main {


    private static HashMap<String, Integer> enumDaysOfWeek() {
	HashMap<String, Integer> enumedDaysOfWeek =
	    new HashMap<String, Integer>();
	enumedDaysOfWeek.put("Mon", 0);
	enumedDaysOfWeek.put("Tue", 1);
	enumedDaysOfWeek.put("Wed", 2);
	enumedDaysOfWeek.put("Thu", 3);
	enumedDaysOfWeek.put("Fri", 4);
	enumedDaysOfWeek.put("Sat", 5);
	enumedDaysOfWeek.put("Sun", 6);
	return enumedDaysOfWeek;
    }

    // till: Mon, Tue, Wed, Thu, Fri, Sat, Sun
    private static int getNdaysTill(String till,
				    HashMap<String, Integer> enumedDaysOfWeek) {

	int refDayEnum = enumedDaysOfWeek.get(till);
	String today1 = Calendar.getInstance().getTime().toString();
	String todayDayOfWeek = today1.split(" ")[0];
	int todayEnum = enumedDaysOfWeek.get(todayDayOfWeek);

	if (refDayEnum >= todayEnum) {
	    return refDayEnum - todayEnum;
	} else {
	    return 7 - (todayEnum - refDayEnum);
	}

     }

    public static void main(String[] args) {

	HashMap<String, Integer> enumedDaysOfWeek = enumDaysOfWeek();
	int daysTillFriday = getNdaysTill("Fri", enumedDaysOfWeek);
	System.out.println("Days till Friday (from today): " +
			   daysTillFriday);
    }
}
