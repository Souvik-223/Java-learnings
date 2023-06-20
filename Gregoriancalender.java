import java.util.*;
public class Gregoriancalender {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2022));     
        
        //Timezones
        System.out.println(TimeZone.getAvailableIDs()[0]);    
        System.out.println(TimeZone.getAvailableIDs()[9]);    
    }
}