import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Main {


    private static HashMap<String, String> getEnToPlDays() {
	HashMap<String, String> daysEnToPl = new HashMap<String, String>();
	daysEnToPl.put("Mon", "Poniedzialek");
	daysEnToPl.put("Tue", "Wtorek");
	daysEnToPl.put("Wed", "Sroda");
	daysEnToPl.put("Thu", "Czwartek");
	daysEnToPl.put("Fri", "Piatek");
	daysEnToPl.put("Sat", "Sobota");
	daysEnToPl.put("Sun", "Niedziela");
	return daysEnToPl;
    }

    public static void main(String[] args) {

	// https://alvinalexander.com/blog/post/java/determine-today-date/
	// format: "Mon Apr 19 14:30:57 CEST 2021"
	String today1 = Calendar.getInstance().getTime().toString();
	String todayDayOfWeek = today1.split(" ")[0];
	HashMap<String, String> daysEnToPl = getEnToPlDays();
	System.out.println("Today is (in polish): " +
			   daysEnToPl.get(todayDayOfWeek));
    }
}
