/*
Java program to check if a string contains duplicate alphabets.
*Blank spaces are not considered*
Input: i am strong
Output: No duplicate alphabets found

Input: i am geek
Output: Duplicate alphabets found
 */
package DataStructures.Strings;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharacters {

    String str;

    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = in.nextLine();
    }

    public boolean checkDuplicate(){

        char[] ch = str.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: ch){
            if (c!= ' ' && map.containsKey(c))
                return false;
            else
                map.put(c,1);
        }
        return true;
    }

    public static void main(String[] args) {
        DuplicateCharacters object = new DuplicateCharacters();
        object.getInput();
        if (object.checkDuplicate())
            System.out.println("No duplicate alphabets found");
        else
            System.out.println("Duplicate alphabets found");
    }
}
