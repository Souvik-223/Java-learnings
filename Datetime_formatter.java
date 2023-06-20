import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetime_formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();  //This is the date 
        System.out.println(dt);

        DateTimeFormatter ds = DateTimeFormatter.ofPattern("dd-mm-yyyy -- E H:m a"); //This is the format of the date to be displayed
        DateTimeFormatter ds2 = DateTimeFormatter.ISO_LOCAL_DATE; //This is the pre defined given format of the date to be displayed

        String date = dt.format(ds);  //Creating date string using date and time
        String date2 = dt.format(ds2);  //Creating date string using date and time
        
        System.out.println(date);
        System.out.println(date2);
    }
}
