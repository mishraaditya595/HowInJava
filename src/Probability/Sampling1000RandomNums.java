/*
For the following distribution of data, sample 1000 random numbers.
x	P(X=x)
1	0.2
2	0.5
3	0.2
4	0.1
Note: Sampling 1000 random numbers from the above given distribution means,
you should get close to 200 1’s, 500 2’s, 200 3’s, and 100 4’s.
 */
package Probability;

import java.util.Random;
import java.util.Scanner;

public class Sampling1000RandomNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter seed value: ");
        int seed_value = in.nextInt();

        Random random = new Random();
        random.setSeed(seed_value);
        int p1 = 0,
            p2 = 0,
            p3 = 0,
            p4 = 0;

        for (int i = 1; i<=1000; i++){
            double n = random.nextDouble();
            if (n <= 0.2)
                p1++;
            else if (n <= 0.7)
                p2++;
            else if (n <= 0.9)
                p3++;
            else
                p4++;
        }

        System.out.println("The number of times 1 is generated is " + p1);
        System.out.println("The number of times 2 is generated is " + p2);
        System.out.println("The number of times 3 is generated is " + p3);
        System.out.println("The number of times 4 is generated is " + p4);
    }
}
