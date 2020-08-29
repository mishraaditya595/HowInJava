/*
Given an integer N, count the trailing zeros in factorial of N.

Input: 20, Output: 4 (Explanation: Factorial of 20 = 2432902008176640000 which contains 4 trailing zeros)
Input: 4617, Output: 1151
Input: 1000, Output: 249
 */
package Numbers;

import java.util.Scanner;

public class Trailing0sFactorial {

    public static int trailingZerosInFactorial(int n) {
        int count = 0, i = 1;
        while (true){
            int p = (int) Math.pow(5,i);
            int r = n/p;
            if (r==0)
                break;
            else
                count+=r;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(trailingZerosInFactorial(n));
    }
}
