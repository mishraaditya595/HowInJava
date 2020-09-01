/*
A numeric string is beautiful if it can be split into a sequence of two or more positive integers satisfying the following conditions:
(1) a[i] - a[i-1] = 1
(2) a[i] should not contain a leading zero
(3) The contents of the sequence cannot be rearranged.

Input: 1234    Output: Yes
Explanation: 1234 can be split into 4 integers i.e. 4,3,2,1 where 4-3 = 3-2 = 2-1 = 1;

Input: 99100   Output: Yes
Explanation: 99100 can be split into 2 integers i.e 100,99 where 100-99 = 1;

Input: 10203   Output: No
Explanation: We can split it into 1,02,03 but 02 & 03 has leading zeros and if we split it into 1,2,3 then we are
             rearranging the sequence and 0-0 != 1.
 */
package DataStructures.Strings;

import java.util.Scanner;

public class BeautifulNumericString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numeric string: ");
        String str = in.next();
        boolean b = false;
        for (int i=1; i<=str.length()/2; ++i) {
            long x = Long.parseLong(str.substring(0,i));
            String test = Long.toString(x);
            while (test.length() < str.length()) {
                test += Long.toString(++x);
            }
            if (test.equals(str)) {
                b = true;
                break;
            }
        }
        if (b)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
