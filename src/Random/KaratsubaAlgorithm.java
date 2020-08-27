/*
Given two binary strings that represent value of two integers, find the product of two strings.
For example, if the first bit string is “1100” and second bit string is “1010”, output should be 120.

Input:
First line consists of T test cases. Only line of every test case consists of 2 binary strings.

Output:
Single line output, print the multiplied value.

Constraints:
1<=T<=100
1<=Length of string<=100

Example:
Input: 1100 01  Output: 12
Input: 01 01    Output: 1
 */

package Random;

import java.util.Scanner;

public class KaratsubaAlgorithm {
    String n1, n2;

    public void getInput() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter two binary numbers");
            System.out.print("1st num: ");
            n1 = in.next();
            in.nextLine();
            System.out.print("2nd num: ");
            n2 = in.next();
            if (n1.length() >= 1 && n1.length() <= 100 && n2.length() >= 1 && n2.length() <= 100)
                break;
            else {
                System.out.println("The inputs should have atleast 1 digits and atmost 100 digits");
                System.out.println("Enter 0 to end program and any other digit to try again");
                int ch = in.nextInt();
                if (ch == 0)
                    System.exit(0);
            }
        }
    }

    public int multiply(){
        int N1 = Integer.parseInt(n1,2);
        int N2 = Integer.parseInt(n2,2);
        return N1*N2;
    }

    public static void main(String[] args) {
        KaratsubaAlgorithm object = new KaratsubaAlgorithm();
        object.getInput();
        System.out.println("Output: "+object.multiply());
    }
}
