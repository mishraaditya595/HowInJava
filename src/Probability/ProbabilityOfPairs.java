/*
Given an array of N integers, You have to find the probability of choosing a pair(A[i], A[j]), where i < j and
A[i] <= A[j], such that A[i] + A[j] is maximum.

Input: arr[ ] = {1, 1, 6, 2, 5, 3, 4, 2}
Output: 4/18 = 0.2222
[(1,1)(1,6)(1,2)(1,5)(1,3)(1,4)(1,2)   (1,6)(1,2)(1,5)(1,3)(1,4)(1,2)  (2,5)(2,3)(2,4)(2,2)  (3,4)]

Input arr[ ] = {1, 7, 2, 6, 3, 1, 5, 4, 2, 1}
Output: 3/19 = 0.15789
[(1,7)(1,2)(1,6)(1,3)(1,1)(1,5)(1,4)(1,2)(1,1)  (2,6)(2,3)(2,5)(2,4)(2,2)  (3,5)  (1,5)(1,4)(1,2)(1,1)]

Input: arr[ ] = {1, 2, 2, 3}
Output: 2/6 = 0.3333
[(1,2)(1,2)(1,3)  (2,2)(2,3)  (2,3)]

Input: arr[ ] = {1, 1, 1, 2, 2, 2}
Output: 3/15 = 0.2
[(1,1)(1,1)(1,2)(1,2)(1,2)  (1,1)(1,2)(1,2)(1,2)  (1,2)(1,2)(1,2)  (2,2)(2,2)(2,2)]
 */
package Probability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProbabilityOfPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        for (int i = 0; i < size; i++)
        {
            int x = in.nextInt();
            list.add(x);
        }

        ArrayList<List<Integer>> newlist = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < size; i++)
        {
            int m = list.get(i);
            for (int j = i+1; j < size; j++)
            {
                int n = list.get(j);

                if (m <= n)
                {
                    if (m + n > max)
                    {
                        max = m + n;
                    }
                    newlist.add(Arrays.asList(m,n));
                }
            }
        }

        int count = 0;
        for(List l : newlist)
        {
            int a = (int) l.get(0);
            int b = (int) l.get(1);
            if (a + b == max)
                count++;
        }

        double output = (double) count / newlist.size();
        //System.out.println(max);
        //System.out.println(newlist);
        //System.out.println(count);
       // System.out.println(newlist.size());
        System.out.println(output);
    }
}
