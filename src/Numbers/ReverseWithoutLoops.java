/*
Program to get the reverse of a num without using loops
Input: 1234
Output: 4321
 */
package Numbers;

import java.util.Scanner;

public class ReverseWithoutLoops {

    public static void reverseNum(int n){
        if (n < 10)
        {
            System.out.print(n);
            return;
        }
        else
        {
            System.out.print(n % 10);
            reverseNum(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = in.nextInt();
        reverseNum(n);
    }
}
