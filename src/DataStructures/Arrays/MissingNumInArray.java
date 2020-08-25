/*
You are given a list of n-1 integers and these integers are in the range of 1 to n.
There are no duplicates in the list. One of the integers is missing in the list.
Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
 */
package DataStructures.Arrays;

import java.util.Scanner;

public class MissingNumInArray {

    public static int getMissingNum(int[] ar, int size)
    {
        int total = (size+1)*(size+2)/2;
        for (int i : ar)
            total -= i;
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();
        int missingNum = getMissingNum(arr,size);
        System.out.println("Missing Number: "+missingNum);
    }

}
