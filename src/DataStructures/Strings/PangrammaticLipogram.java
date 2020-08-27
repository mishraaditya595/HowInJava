/*
A pangrammatic lipogram is a text that uses every letter of the alphabet except one.
Program to check if a string is Pangrammatic Lipogram.

Input: The quick brown fox jumped over the lazy dog.
Output: Pangrammatic Lipogram

Input:
 */
package DataStructures.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class PangrammaticLipogram {

    String str;

    public void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = in.nextLine();
    }

    public boolean checkPL(){
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if (ch == ' ')
                continue;
            if (!list.contains(ch))
                list.add(ch);
        }
        return list.size() == 25;
    }

    public static void main(String[] args) {
        PangrammaticLipogram ob = new PangrammaticLipogram();
        ob.getInput();
        if (ob.checkPL())
            System.out.println("Pangrammatic Lipogram");
        else
            System.out.println("Not a Pangrammatic Lipogram");
    }
}
