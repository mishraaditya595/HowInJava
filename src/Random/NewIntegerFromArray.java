/*
Given an array of integers, the task is to find whether it’s possible to construct an integer using all the digits of these numbers such that it would be divisible by 3. If it is possible then print “1” and if not print “0”.

Input:
The first line consists of an integer T i.e. the number of test cases. First line of each test case consist of an integer n. Next line consists of n spaced integers.

Output:
Print '1' if it is possible to form a number divisible by 3 using the array elements otherwise print '0'.

Constraints:
1 <= T <= 100
1 <= n,a[i] <= 10

Examples:
Input :
2
3
40 50 90
2
1 4
Output :
1
0
 */
package Random;

import java.util.Scanner;

public class NewIntegerFromArray {

    int[] a;

    public void getInput(){
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Enter the size of the array: ");
            a = new int[in.nextInt()];
            if(a.length>=1 && a.length<=10)
                break;
            else {
                System.out.println("The array length should have atleast 1 and atmost 10");
                System.out.println("Enter 0 to end program and any other digit to try again");
                int ch = in.nextInt();
                if (ch == 0)
                    System.exit(0);
            }
        }
        System.out.println("Enter the elements in the array");
        for (int i = 0; i<a.length; i++)
            a[i] = in.nextInt();
    }

    public int formInt(){
        String x = "";
        for (int i : a)
            x += (Integer.toString(i));

        int c=0,k=0;
        for (int i = 0; i < x.length(); i++){
            char ch = x.charAt(i);
            k += Character.getNumericValue(ch);
        }
        return k;
    }

    public int checkDivisibility(){
        int num = formInt();
        if (num % 3 == 0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        NewIntegerFromArray obj = new NewIntegerFromArray();
        obj.getInput();
        System.out.println(obj.checkDivisibility());
    }
}
