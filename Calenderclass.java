import java.util.Calendar;

public class Calenderclass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());
        System.out.println(c.getWeekYear());
    }
}
