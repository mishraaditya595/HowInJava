/*
Juggling algorithm is one of the efficient algorithms used for array rotation.
Input: array = {1,2,3,4,5,6,7}, no_of_rotations = 3
Output: {4,5,6,7,1,2,3}
 */
package DataStructures.Arrays;

import java.util.Scanner;

public class RotateArrayJugglingAlgo {
    int[] arr;
    int no_of_rotations, length;

    public static void main (String[]args)
    {
        RotateArrayJugglingAlgo object = new RotateArrayJugglingAlgo();
        object.getInput();
        System.out.println("Array Elements before rotating : ");
        object.display();
        object.leftRotate();
        System.out.println("\nArray Elements after rotating : ");
        object.display();
    }

    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        length = in.nextInt();
        arr = new int[length];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < length; i++)
            arr[i] = in.nextInt();
        System.out.print("Enter the number of rotations required: ");
        no_of_rotations = in.nextInt();
    }

    public int getGCD(int a, int b){
        if (a == 0)
            return b;

        return getGCD(b%a, a);
    }

    public void display() {
        for (int element : arr)
            System.out.print(element + " ");
    }

    public void leftRotate() {
        int i, j, k, temp, gcd = getGCD(no_of_rotations, length);
        for (i = 0; i < gcd; i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + no_of_rotations;
                if (k >= length)
                    k = k - length;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

}