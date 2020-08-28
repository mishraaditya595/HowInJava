package Numbers;

import java.util.Scanner;

public class LargestNumWithoutUsingIF {

    static int n1, n2;

    public static void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st integer: ");
        n1 = in.nextInt();
        System.out.print("Enter the 2nd integer: ");
        n2 = in.nextInt();
    }

    public static void main(String[] args) {
        getInput();
        Integer sum = (n1 + n2) / 2 + Math.abs(n1 - n2) / 2;
        System.out.println(sum);
    }
}
