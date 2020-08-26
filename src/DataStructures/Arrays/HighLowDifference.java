/*
Find the maximum and minimum difference among all element pairs in an int array.
Explanation:
Maximum difference: largest element - smallest element,
minimum element: 2nd smallest element - smallest element.
Input: arr = {12, 5, 7, 98, 33}
Output: Maximum difference = 93, minimum difference = 2
 */
package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HighLowDifference {

    int[] arr;
    int maxDiff, minDiff;

    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i<size; i++)
            arr[i] = in.nextInt();
    }

    public void findDifference(){
        Arrays.sort(arr); // Arrays.sort() uses quick sort algorithm in the newer JDK versions
        maxDiff = arr[arr.length-1] - arr[0];
        minDiff = arr[1] - arr[0];
    }

    public void display(){
        System.out.println("The maximum difference between array elements is "+maxDiff);
        System.out.println("The minimum difference between array elements is "+minDiff);
    }

    public static void main(String[] args) {
        HighLowDifference ob = new HighLowDifference();
        ob.getInput();
        ob.findDifference();
        ob.display();
    }
}
