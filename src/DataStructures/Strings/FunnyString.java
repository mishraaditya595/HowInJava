/*
Reverse the given string. Iterate through each character of that string,
compare the absolute difference in the ASCII values of the characters at positions 0 and 1, 1 and 2, 2 and 3 and so on to the end.
If the list of absolute differences is the same for both strings, they are funny otherwise not.

Input  : HKMNPS
Output : Funny String
Explanation:
Let r be the reverse of original string s
s = "HKMNPS"
r = "SPNMKH"
|H-K| = 3  = |S-P|
|K-M| = 2  = |P-N|
|M-N| = 1  = |N-M|
|N-P| = 2  = |M-K|
|P-S| = 3  = |K-H|
Since each comparison is equal so given string is funny

Input: bcxz
Output: Not a funny string
 */
package DataStructures.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class FunnyString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str= in.next();
        int len = str.length();

        ArrayList<Integer> list1 = new ArrayList<>(),
                           list2 = new ArrayList<>();

        for (int i = 0; i < len - 1; i++){
            int n1 = Math.abs((int)str.charAt(i) - str.charAt(i+1));
            int n2 = Math.abs((int)str.charAt((len-1)-i) - str.charAt((len-2)-i));
            list1.add(n1);
            list2.add(n2);
        }

        boolean check = list1.equals(list2);
        System.out.println(check? "Funny string" : "Not a funny string");
    }
}
