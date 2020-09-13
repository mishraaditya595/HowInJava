/*
The Utopian Tree goes through 2 cycles of growth every year.
Each spring, it doubles in height. Each summer, its height increases by 1 meter.
Laura plants a Utopian Tree sapling with a height of 1 meter just before spring.
How tall will her tree be after 'N' growth cycles?

Input: 4
Output: 7
Explanation:
Initial height = 1m
The tree doubles its height in spring (height = 2m),
then grows a meter in summer (height = 3m),
then doubles after the next spring (height = 6m), and grows another meter after summer (height = 7m).
Thus, at the end of 4 cycles, its height is 7 meters.

Input: 5   Output: 14
Input: 1   Output: 2
 */
package Numbers;

import java.util.Scanner;

public class UtopianTree {
    static int calculateHeight(int n) {
        if (n == 0)
            return 1;
        int height = 1;
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0)
                height += 1;
            else
                height *=2;
        }
        return height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of growth cycles: ");
        int n = in.nextInt();
        int height = calculateHeight(n);
        System.out.println(height);
    }
}
