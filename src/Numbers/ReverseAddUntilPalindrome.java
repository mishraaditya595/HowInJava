/*
Take input number from the user, reverse it and add it to itself.
If the sum is not a palindrome then repeat the procedure until you get a palindrome.
Input: 4597
Output: 1136311 after 6 trials
Explanation:
0: 4597 is not palindrome so reversing and adding it to itself, we get 12551.
1: 12551 is not palindrome so reversing and adding it to itself, we get 28072.
2: 28072 is not palindrome so reversing and adding it to itself, we get 55154.
3: 55154 is not palindrome so reversing and adding it to itself, we get 100309.
4: 100309 is not palindrome so reversing and adding it to itself, we get 1003310.
5: 1003310 is not palindrome so reversing and adding it to itself, we get 1136311.
6: 1136311 is palindrome. Hence, we stop here.
 */

package Numbers;

import java.util.Scanner;

public class ReverseAddUntilPalindrome {

    String num, rev;

    public void getInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextLine();
    }

    public boolean checkPalindrome(){
        rev = "";
        for (int i = 0; i<num.length(); i++)
            rev = num.charAt(i) + rev;
        return rev.equals(num);
    }

    public void addReverse(){
        String N = num;
        num = "";
        for (int i = 0; i<N.length(); i++)
            num = N.charAt(i) + num;
        int NUM = Integer.parseInt(num) + Integer.parseInt(N);
        num = Integer.toString(NUM);
    }

    public static void main(String[] args) {
        ReverseAddUntilPalindrome object = new ReverseAddUntilPalindrome();
        object.getInput();
        int n = 0;
        while (true){
            if (object.checkPalindrome())
            {
                System.out.println("We got the palindrome number i.e. "+object.rev+" after "+n+" trials");
                break;
            }
            else
            {
                object.addReverse();
                n++;
            }
        }
    }
}
