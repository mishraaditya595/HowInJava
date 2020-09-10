/*
Find all pairs of elements in the given array whose sum is equal to a given number.
Input: array = {1,3,5,7,6,4,8,6}, sum = 12
Output:
( 7 , 5 )
( 6 , 6 )
( 4 , 8 )
 */
package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PairsWithAGivenSum {

    int[] arr;
    int sum;

    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i<size; i++)
            arr[i] = in.nextInt();
        System.out.print("Enter the sum: ");
        sum = in.nextInt();
    }

    public void checkForPairs(){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr){
            if (!map.containsKey(i))
                map.put(i,1);
            else {
                int value = map.get(i);
                value++;
                map.put(i,value);
            }
        }
        ArrayList<String> pairs = new ArrayList<>();
        for (int i : arr){
            int temp = sum - i;
            if (temp>0 && map.containsKey(temp))
            {
                pairs.add("( "+Integer.toString(i)+" , "+Integer.toString(temp)+" )");
                map.remove(temp);
                map.remove(i);
            }
        }

        if (!pairs.isEmpty()){
            System.out.println("The pairs are ");
            for (String each : pairs)
                System.out.println(each+" ");
        } else {
            System.out.println("No pairs are found.");
        }
    }

    public static void main(String[] args) {
        PairsWithAGivenSum ob = new PairsWithAGivenSum();
        ob.getInput();
        ob.checkForPairs();
    }
}
