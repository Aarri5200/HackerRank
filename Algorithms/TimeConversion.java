import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
         String str = s.substring(8);  // Last two characters (AM/PM)
        int hrs = Integer.parseInt(s.substring(0, 2));  // First two characters for hour

        // Convert based on AM/PM
        if (str.equals("PM")) {
            if (hrs != 12) {
                hrs += 12;
            }
        } else {
            if (hrs == 12) {
                hrs = 0;  // Special case for 12 AM
            }
        }

        // Format the hour back to two digits and concatenate the rest of the string
        return String.format("%02d", hrs) + s.substring(2, 8);  // Format as HH:MM:SS
    }
        

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
