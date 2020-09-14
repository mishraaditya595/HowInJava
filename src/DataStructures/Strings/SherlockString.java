/*
A string is considered as Sherlock String if:
* All the characters appear equal number of times in the string.
                             OR
* Deleting one instance of a particular character, satisfies the first condition.

Input: abc      Output: It is a Sherlock string.
Explanation: each character appears once

Input: abcc     Output: It is a Sherlock string.
Explanation: deleting one instance of 'c', every character appears equal number of times.

Input: abccc    Output: It is not a Sherlock string.
Explantion: Even after removing one instance of 'c', we cannot satisfy the primary condition.

Input: abcdefghhgfedecba        Output: It is a Sherlock string.
Explanation: All characters occur twice except for 'e' which occurs 3 times.
             Deleting one instance of 'e', all characters appear equal number of times.

Input: aabbccddeefghi           Output: It is not a Sherlock string.
 */

package DataStructures.Strings;

import java.util.HashMap;
import java.util.Scanner;

public class SherlockString {

    static String isValid(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()){
            if (map.containsKey(ch))
            {
                int counter = map.get(ch);
                map.put(ch,++counter);
            }
            else
            {
                map.put(ch,1);
            }
        }
        int k = map.get(s.charAt(0));
        boolean flag = true;
        for (int i : map.values()){
            if (i != k)
                flag = false;
        }

        if (flag)
            return "Yes";

        for (int i = 0; i < s.length(); i++) {
            flag = true;
            map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
            k = map.get(s.charAt(0));
            for (int t : map.values()) {
                if (t != k && t > 0)
                {
                    flag = false;
                }
            }
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);

            if (flag)
            {
                return "Yes";
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.next();
        String x = isValid(s);
        System.out.println(x);
    }
}
