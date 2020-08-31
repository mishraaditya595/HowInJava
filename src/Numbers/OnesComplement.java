/*
Given an integer N as input, find 1's complement of N.
Input: 5
Output: 2
 */
package Numbers;

import Numbers.NumberSystemConversion.Binary2Hexadecimal;
import Numbers.NumberSystemConversion.Decimal2Binary;
import java.util.Scanner;

public class OnesComplement {

    public static int getComplement(int n){
        int binary = Decimal2Binary.toBinary(n);
        String complement = "";
        while (binary>0){
            int r = binary % 10;
            if (r == 1)
                r = 0;
            else if (r == 0)
                r = 1;
            complement = r + complement;
            binary /= 10;
        }
        int c = Integer.parseInt(complement);
        return Binary2Hexadecimal.toDecimal(c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = in.nextInt();
        System.out.println("1's complement: "+getComplement(n));
    }
}
