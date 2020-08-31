/*
Given a Binary number, convert it into a Hexadecimal number.
Input: 11000010
Output: C2
 */
package Numbers.NumberSystemConversion;

import java.util.Scanner;

public class Binary2Hexadecimal {

    public static int toDecimal(int n){
        int dec = 0, i = 0;
        while (n>0){
            int r = n % 10;
            dec += r * Math.pow(2,i);
            i++;
            n/=10;
        }
        return dec;
    }

    public static String toHex(int num){
        int dec = toDecimal(num);
        String hex = "";
        while (dec>0){
            int r = dec % 16;
            switch (r){
                case 10: hex = 'A' + hex; break;
                case 11: hex = 'B' + hex; break;
                case 12: hex = 'C' + hex; break;
                case 13: hex = 'D' + hex; break;
                case 14: hex = 'E' + hex; break;
                case 15: hex = 'F' + hex; break;
                default: hex =  r  + hex; break;
            }
            dec/=16;
        }
        return hex;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num in binary: ");
        int n = in.nextInt();
        System.out.println("Hexadecimal: "+toHex(n));
    }
}
