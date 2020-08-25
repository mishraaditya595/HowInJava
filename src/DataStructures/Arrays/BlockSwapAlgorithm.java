/*
Block swap algorithm is one of the efficient algorithms used for array rotation.
Input:
Array size: 7
Array elements: 1,2,3,4,5,6,7
Number of rotations: 2
Output:
3,4,5,6,7,1,2
 */

package DataStructures.Arrays;

import java.util.Scanner;

public class BlockSwapAlgorithm {

    private int[] swap(int[] arr, int a, int b, int d) {
        int temp;
        for (int i = 0; i < d; i++){
            temp = arr[a+i];
            arr[a + i] = arr[b + i];
            arr[b + i] = temp;
        }
        return arr;
    }

    public int[] rotate(int a[], int n, int size){
        int[] arr = a;

        if(n==0 || n==size)
            return arr;

        int i = n, j = size - n;

        while (i!=j){
            if (i<j){
                arr = swap(arr, n-i, n+j-i, i);
                j = j-i;
            } else {
                arr = swap(arr, n-i, n, j);
                i = i-j;
            }
        }

        arr = swap(arr, n-i, n, j);
        return arr;
    }



    public static void main(String[] args) {
        BlockSwapAlgorithm obj = new BlockSwapAlgorithm();

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();

        System.out.print("Number of rotations: ");
        int n = in.nextInt();

        arr = obj.rotate(arr, n, size);

        System.out.print("Array after rotation: ");
        for (int element: arr)
            System.out.print(element+" ");
    }
}
