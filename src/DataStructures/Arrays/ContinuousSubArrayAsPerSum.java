/*
Find continuous sub array of the given array whose sum is equal to a given number.
Input: arr = {12, 5, 31, 9, 21, 8}, sum = 45
Output: {5, 31, 9}

Input: arr = {1, 4, 7, 2}, sum = 3
Output: No sub array could be generated.
 */
package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ContinuousSubArrayAsPerSum {

    int[] arr;
    int[] subArr;
    int sum;

    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        arr = new int[size];
        subArr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();
        System.out.print("Enter the sum: ");
        sum = in.nextInt();
    }

    public boolean generateSubArray(){
        int s = 0, j = 0, k = 0;
        for (int i = 0; i<arr.length; i++){
            s+=arr[i];
            if (s<=sum)
            {
                subArr[k] = arr[i];
                k++;
                if (s==sum)
                {
                    return true;
                }
            }
            else if (s>sum)
            {
                i = j++;
                s = 0;
                k = 0;
            }
        }
        return false;
    }

    public void display(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : subArr){
            if (i != 0)
                list.add(i);
        }
        System.out.println(list);

    }

    public static void main(String[] args) {
        ContinuousSubArrayAsPerSum ob = new ContinuousSubArrayAsPerSum();
        ob.getInput();
        if (ob.generateSubArray())
            ob.display();
        else
            System.out.println("No sub array could be generated.");
    }
}
