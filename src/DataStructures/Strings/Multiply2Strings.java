/*
Given two large numbers as stings n1 and n2, find the product of n1 & n2.
 */
package DataStructures.Strings;

import java.math.BigInteger;
import java.util.Scanner;

public class Multiply2Strings {

    private static String multiply(String s1, String s2) {
    BigInteger n1 = new BigInteger(s1);
    BigInteger n2 = new BigInteger(s2);
    BigInteger multiply = n1.multiply(n2);
    return multiply.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two strings:");
        String s1 = in.nextLine(),
               s2 = in.nextLine();
        String product = multiply(s1, s2);
        System.out.println(product);
    }


}
