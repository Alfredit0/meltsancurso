/**
*Display the Calendar.DATE, Calendar.HOUR using the timezone of the city you live
*and timezone of "Europe/Berlin".
*@autor Alfredo Reyes
*@version 1.0
*/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MyCalendar{
  public static void main(String[] args) {
    // Create a calendar object and set it time based on the local
    // time zone
    Calendar localTime = Calendar.getInstance();

    // Print the local ate and hour
    System.out.println("Calendar.DATE local: "+localTime.get(Calendar.DATE));
    System.out.println("Calendar.HOUR local: "+localTime.get(Calendar.HOUR));

    // Create a calendar object for representing a Germany time zone. Then we
    // wet the time of the calendar with the value of the local time
    Calendar germanyTime = new GregorianCalendar(TimeZone.getTimeZone("Europe/Berlin"));
    germanyTime.setTimeInMillis(localTime.getTimeInMillis());

    //Print the Berlin date and hour
    System.out.println("Calendar.DATE Berlin: " +germanyTime.get(Calendar.DATE));
    System.out.println("Calendar.HOUR Berlin: " +germanyTime.get(Calendar.HOUR));
  }
}
