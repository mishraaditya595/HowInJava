/*
A string is said to be an anagram if it contains the same characters and same length, but in a different order.
e.g. army and Mary are anagrams.
 */

package DataStructures.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = in.nextLine();
        if (checkAnagram(s1,s2))
            System.out.println("Yes, they are anagrams");
        else
            System.out.println("No, they are not anagrams");
    }

    private static boolean checkAnagram(String s1, String s2) {
        s1 = s1.toLowerCase(); s2 = s2.toLowerCase();
        s1 = s1.trim(); s2 = s2.trim();

        boolean out = false;
        if (s1.length() != s2.length())
            return out;
        else {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            out = Arrays.equals(c1,c2);
        }
        return out;
    }
}
