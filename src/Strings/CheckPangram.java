/*
Check if a String is Pangram or not.
A pangram is a sentence containing every letter in the English Alphabet.
Input: Abcdefghijklmnopqrstuvwxyz
Output: Pangram

Input: Abcdefghijklmnopqrstuvwxyz12
Output: Not a Pangram
 */
package Strings;

import java.util.Scanner;

public class CheckPangram {

    String str;

    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an alphabet string: ");
        str = in.nextLine();
    }

    public boolean checkPangram(){
        for (int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if (!(ch >= 97 && ch <= 122 || ch == 32))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPangram ob = new CheckPangram();
        ob.getInput();
        if (ob.checkPangram())
            System.out.println(ob.str+" is a pangram");
        else
            System.out.println(ob.str+" is not a pangram");
    }
}
