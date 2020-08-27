package Random;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = in.nextInt();
        for (int a = 1; a < (1 << n); a++) {
            System.out.println("Disk Move from Peg "+(a&a-1)%3 +" to Peg "+((a|a-1)+1)%3);
        }
    }
}
