/*
For a given time input in 12-hour format, show the time in 24 hour format.
Input: 07:05:45PM        Output: 19:05:45
Input: 12:01:34PM        Output: 12:01:34
Input: 12:37:46AM        Output: 00:37:46
 */
package Numbers;

import java.util.Scanner;

public class TimeConversion {
    static String timeConversion(String t) {
        String outTime = "";
        int len = t.length();
        if (t.contains("AM") && t.substring(0,2).equals("12"))
            outTime = "00" + t.substring(2,len-2);
        else if (t.contains("AM"))
            outTime = t.substring(0,len-2);
        else if (t.contains("PM") && t.substring(0,2).contains("12"))
            outTime = t.substring(0,len-2);
        else{
            String hours = t.substring(0,2);
            int h = Integer.parseInt(hours);
            h = h + 12;
            outTime = h + t.substring(2,len-2);
        }
        return outTime;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter time: ");
        String time = in.nextLine();
        String outputTime = timeConversion(time);
        System.out.println(outputTime);
    }
}
