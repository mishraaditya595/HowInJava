/*
Given an integer N as input in decimal format, convert it into binary without using an array.
Input: 25
Output: 11001
 */
package Numbers.NumberSystemConversion;

import java.util.Scanner;

public class Decimal2Binary {

    public static int toBinary(int n){
        String binary = "";
        while (n>0){
            int r = n % 2;
            binary = r + binary;
            n/=2;
        }
        return Integer.parseInt(binary);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = in.nextInt();
        System.out.println("Binary: "+toBinary(n));
    }
}
