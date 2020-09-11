/*
We are studying a sub-atomic particle which undergoes transformation at a regular time-interval and
each transformation changes the state of a particle to one of 4 possible states (each state is equally likely).
Whenever two neighboring particles have identical states, they annihilate each other, and such particles are called unstable.
We need to calculate the average number of unstable pairs during the observation.

Input: N = 27, T = 10
Output: 6.9
Explanation:
N: Number of particles arranged in a line. Each particle can take any state between 1 and 4 inclusive.
Consider the value of T as seed input to generate the states of particle at each time-interval (T=1,2,3,…,10)

T = 1:  2, 1, 3, 1, (4, 4), (4, 4), 2, 1, 4, 1, (4, 4), 1, 4, 3, 2, 1, 3, (1, 1), (1, 1), 4, 2, 4         =>   5
T = 2:  (1, 1), 1, 3, 2, (3, 3), 2, 1, 2, (4, 4), 3, 4, 3, (1, 1), 3, 4, 3, (4, 4), (2, 2), (2, 2), 1     =>   7
.
.
.
.
T = 10:

Number of unstable pairs at T = 1:    5
Number of unstable pairs at T = 2:    7
Number of unstable pairs at T = 3:    n
.
.
.
Number of unstable pairs at T = 10:   p

Input: N = 60, T = 16
Output: 15.187
 */
package Probability;

import java.util.Random;
import java.util.Scanner;

public class StudyOfSubAtomicParticles {

    static int generateRandomInt(Random random){
        int upperbound = 4;
        int lowerbound = 1;
        int n = random.nextInt(upperbound - lowerbound) + lowerbound;
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = in.nextInt();
        System.out.print("Enter the value of T: ");
        int T = in.nextInt();

        int sum = 0;
        Random random = new Random();
        for (int i = 1; i <= T; i++){
            random.setSeed(i);
            int temp = 0, count = 0;
            for (int j = 1; j <= N; j++){
                int r = generateRandomInt(random);
                if (r == temp){
                    count++;
                    temp = 0;
                    continue;
                }
                temp = r;
            }
            sum += count;
        }
        double average = (float)sum/T;
        System.out.println(average);
    }
}
