// class Calender_day{
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//     }
// }
import java.io.*;
import java.util.Calendar;
class calender {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day); 
                

       int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);


String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
          return days[dayOfWeek - 1];

            }

}
public class Calender_day {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");


        bufferedReader.close();
        bufferedWriter.close();
        
    }
}
