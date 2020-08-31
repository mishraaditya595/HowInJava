/*
Given an array A comprising of N non-zero, positive integers and an integer X,
find the logical OR of all such elements in the array that are a multiple of X.
The result of OR operation should be printed in decimal form. If there is only one multiple of X in A,
print the element in decimal form. If no multiple of X is found, print 0.

Input: N = 5, A = {9,3,1,6,1}, X = 15
Output: 15

 */
package Numbers;

import java.util.Scanner;

public class FactorORMultiple {

    public static int getBinary(int num){
        String x = Integer.toBinaryString(num);
        return Integer.parseInt(x);
    }

    public static int OR(int[] arr, int n){
        int or = 0, c = 0;
        for (int element : arr){
            if (element % n == 0){
                or = or|element;
            }
        }
        return or;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int length = in.nextInt();
        int[] arr = new  int[length];
        System.out.println("Enter the array elements");
        for (int i = 0; i < length; i++)
            arr[i] = in.nextInt();

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(OR(arr,n));
    }
}
