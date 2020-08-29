/*
Given a binary integer N, find whether N has alternate bits pattern.

Input: N = 10101
Output: Alternating pattern exists;

Input: N = 1001
Output: Alternating pattern not found
 */

package Numbers;

import java.util.Scanner;

public class BinaryNumberPattern {

    public static boolean checkPattern(int num) {
        int r=99;
        while (num>0){
            if (num % 10 == r)
                return false;
            r = num % 10;
            num/=10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String s = in.next();
        if (checkPattern(Integer.parseInt(s))){
            System.out.println("Alternating pattern exists");
        }
        else
            System.out.println("Alternating pattern not found");
    }
}
