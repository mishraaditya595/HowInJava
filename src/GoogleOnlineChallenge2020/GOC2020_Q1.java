/*
In the range of N-digit numbers, print the number of numbers that is divisible by both X and Y.
Input: n = 3, x = 2, y = 5;
Output: 90

Input: n = 2, x = 3, y = 4;
Output: 8
 */
package GoogleOnlineChallenge2020;

import java.util.*;

public class GOC2020_Q1 {

    static int solve(int N, int X, int Y){
        String s1="1", s2="9";
        for(int i=1;i<=N-1;i++)
        {
            s1+="0";
            s2+="9";
        }

        int low = Integer.parseInt(s1);
        int high = Integer.parseInt(s2);
        int count = 0;
        for(int i = low; i <= high; i++)
        {
            if(i%X==0 && i%Y==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of digits required: ");
        int n = in.nextInt();
        System.out.print("Enter the 1st divisor: ");
        int x = in.nextInt();
        System.out.print("Enter the 2nd divisor: ");
        int y = in.nextInt();
        System.out.println("Number of divisible numbers are: "+solve(n,x,y));
    }
}