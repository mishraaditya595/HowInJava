/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

Input: matrix =
11    2    4
 4    5    6
10    8  -12
Output: 15
Explanation:
Sum of diagonal 1 elements = 11 + 5 - 12 = 4
Sum of diagonal 2 elements =  4 + 5 + 10 = 19
Absolute difference  = | 4 - 19 | = 15
 */
package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> matrix) {
        int size = matrix.size(), sumP=0, sumS=0;
        for (int i = 0; i < size; i++){
            List<Integer> m = matrix.get(i);
            int a = m.get(i);
            int b = m.get(size-1-i);
            sumP += a;
            sumS += b;
        }
        return Math.abs(sumP-sumS);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num of rows & columns of the square matrix: ");
        int n = in.nextInt();
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            System.out.println("Enter elements of row " + i);
            for (int j = 1; j <= n; j++){
                int element = in.nextInt();
                row.add(element);
            }
            matrix.add(row);
            row = new ArrayList<>();
        }
        System.out.println("Diagonal Difference: " + diagonalDifference(matrix));
    }
}
