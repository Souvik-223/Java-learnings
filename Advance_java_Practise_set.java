import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Advance_java_Practise_set {
    public static void main(String[] args) {

        /* Question 1 - Create a array list and store 10 names of students in int then print it */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String x = sc.nextLine();
            ar.add(i, x);
        }
        // Printing array 
        System.out.println();
        for (int i = 0; i < 10; i++) {
                System.out.println(ar.get(i));
            }
             
            
        /* Question 2 - Use Date class to print the time in following pattern 21:47:02 */
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        
        /* Question 3 - Use Calendar class to print the time in following pattern 21:47:02 */
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));


        /* Question 4 - Use java.time package to print the time in following pattern 21:47:02 */
        LocalTime lc = LocalTime.now();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("hh:mm:ss");
        String st = lc.format(dt);
        System.out.println(st);


        /* Question 5 - Create a set in java and try to store duplicate entries in and verify that only one instance is entered */
        Scanner sc2 = new Scanner(System.in);
        HashSet<Integer> hr = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int x = sc2.nextInt();
            hr.add(x);
        }             
        System.out.println(hr);
    }
}
