/*
You have a string of lowercase English alphabetic letters. You can perform two types of operations on the string:
(1) Append a lowercase English alphabetic letter to the end of the string.
(2) Delete the last character in the string. Performing this operation on an empty string results in an empty string.

Given an integer, k, and two strings, s and t, determine whether or not you can convert s to t by
performing exactly k of the above operations on s. If it's possible, print Yes. Otherwise, print No.

Input: s = "hackerhappy", t = "hackerrank", k = 9
Output: Conversion possible
Explanation: The first 5 steps, we delete the last character in s.
             The next 4 steps, we append {'r','a','n','k'} to s.
             Hence, within 9 steps the conversion is possible.

Input: s = "ashley", t = "ash", k = 2
Output: Conversion not possible
 */
package DataStructures.Strings;

import java.util.Scanner;

public class AppendAndDelete {

    static boolean appendAndDelete(String s, String t, int k) {
        int min = Math.min(s.length(), t.length());
        int i;
        for (i = 0; i < min; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (c1 != c2)
                break;
        }
        int diff1 = s.length() - i;
        int diff2 = t.length() - i;

        if (diff1 + diff2 <= k)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = in.nextLine();
        System.out.print("Enter the number of operations allowed: ");
        int k = in.nextInt();

        if (appendAndDelete(s1.toLowerCase(), s2.toLowerCase(), k))
            System.out.println("Conversion possible");
        else
            System.out.println("Conversion not possible");
    }
}
