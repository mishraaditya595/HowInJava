/*
The Tower of Hanoi is a mathematical game or puzzle.
It consists of three rods and a number of disks of different sizes, which can slide onto any rod.
The puzzle starts with the disks in a neat stack in ascending order of size on one rod, the smallest at the top, thus making a conical shape.

The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
1. Only one disk can be moved at a time.
2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
3. No larger disk may be placed on top of a smaller disk.
 */
package Numbers;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = in.nextInt();
        for (int i = 1; i < (1 << n); i++) {
            System.out.println("Disk Move from Peg "+(i&i-1)%3 +" to Peg "+((i|i-1)+1)%3);
        }
    }
}
