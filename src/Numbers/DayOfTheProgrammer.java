/*
From 1700 to 1917 , Russia's official calendar was the Julian calendar;
since 1919 they used the Gregorian calendar system. The transition from the Julian to Gregorian calendar system
occurred in 1918, when the next day after January 31 was February 14.
This means that in 1918, February 14 was the 32nd day of the year in Russia.

In both calendar systems, February is the only month with a variable amount of days; it has 29 days during a leap year,
and 28 days during all other years. In the Julian calendar, leap years are divisible by 4;
in the Gregorian calendar, leap years are divisible by 400 or divisible by 4 and not divisible by 100 .

Given a year find the date of the 256th day of that year according to the official Russian calendar during that year.
Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is the given year.

Input: 2016     Output: 12.09.2016
Input: 1800     Output: 12.09.1800
 */
package Numbers;

import java.util.Scanner;

public class DayOfTheProgrammer {

    static boolean isLeapYear(int year){
        boolean flag = false;
        if (year < 1919)
            flag = year % 4 == 0;
        else
            flag = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        return flag;
    }

    static String dayOfProgrammer(int year) {
        int[] months = new int[12];
        if (isLeapYear(year))
        {
            if (year < 1918)
                months = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            else if (year > 1918)
                months = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }
        else
        {
            if (year < 1918)
                months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            else if (year > 1918)
                months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }

        if (year == 1918)
            months = new int[]{31, 14, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day_count = 0, month = 0, date = 0;
        for (int i = 0; i < 11; i++) {
            day_count += months[i];
            if (day_count + months[i+1] > 256){
                month = i + 2;
                date = 256 - day_count;
                break;
            }
        }
        String return_date = "";
        if (month < 10)
            return_date = Integer.toString(date) + ".0" + Integer.toString(month) + "." + Integer.toString(year);
        else
            return_date = Integer.toString(date) + "." + Integer.toString(month) + "." + Integer.toString(year);
        return return_date;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String date = dayOfProgrammer(year);
        System.out.println(date);
    }
}
