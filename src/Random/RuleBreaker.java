package Random;

//There are 100 students in class 4th of Bennett International School. All the students are standing in a row height-wise.
// Some of the students from back, decided to break the rule and they come in front of the line.
// Determine the position from which students are standing height-wise.
//
//        Input: The first line contains the number of students n, where (2 ≤ n ≤ 100).
//        The second line contains the height of students, where (3 ≤ height ≤ 10).
//        Output: The output prints the position number of the student from which rest of the students are standing height-wise.
//        Note: The row starts from the 1st position.
//        Sample Input
//        8
//        5.7, 4.8, 4.9, 3.3, 3.4, 3.6, 4.2, 4.4
//        Output
//        4


import java.util.Scanner;

public class RuleBreaker
{
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        Double arr[] = new Double[n];

        for (int i = 0; i < n; i++)
            arr[i] = in.nextDouble();

        int k = 0;

        for (int i = 0; i < n-1; i++)
        {
            if (arr[i] >= arr[i+1])
                k=i;
        }

        System.out.println(k+2);
    }
}
