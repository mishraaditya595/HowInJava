/*
Given a number N, find the smallest number such that the sum of its digits is N and it is divisible by 10^N .
Input: 15, Output: 69000000000000000
Input: 26, Output: 59900000000000000000000000
 */
package Numbers;

import java.util.Scanner;

public class SumOfDigitsDivBy10powN {

    public static int smallestNum(int n){
        int x = 0, i = 1;
        while (true){
            x = getSumOfDigits(i);
            if (x == n)
                break;
            i++;
        }
        return i;
    }

    private static int getSumOfDigits(int i) {
        int sum = 0;
        while (i > 0){
            sum += i % 10;
            i/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = in.nextInt();
        int small = smallestNum(N);
        System.out.print(small);
        while (N > 0) {
            System.out.print("0");
            N--;
        }
    }
}
