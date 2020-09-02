/*
Calculate and print the factorial of a given integer n where n > 20.
Note: Factorials of n > 20 cannot be stored in 'long' variables.

Input: 25
Output: 15511210043330985984000000
 */
package Numbers;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {

    static void extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= n; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        extraLongFactorials(num);
    }
}
