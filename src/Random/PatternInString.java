/*
Given a dictionary of words and a pattern.
Every character in the pattern is uniquely mapped to a character in the dictionary.
Find all such words in the dictionary that match the given pattern.

Input: {abb,abc,xyz,xyy}, pattern  = foo
Output: abb xyy
Explanation: xyy and abb have the same character at index 1 and 2 like the pattern.

Constraints:
1 <= num. of inputs <= 10
 */
package Random;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class PatternInString {

    ArrayList<String> list = new ArrayList<String>();
    String pattern;

    public void getInput(){
        Scanner in = new Scanner(System.in);
        int size;
        while (true){
            System.out.print("Enter the number of inputs: ");
            size = in.nextInt();
            if (size >= 1 && size <= 10)
                break;
            else {
                System.out.println("The number of inputs should be atleast 1 and atmost 10");
                System.out.println("Enter 0 to end program and any other digit to try again");
                int ch = in.nextInt();
                if (ch == 0)
                    System.exit(0);
            }
        }
        System.out.println("Enter the inputs: ");
        for (int i = 0; i < size; i++) {
            String s = in.nextLine();
            list.add(s);
        }
        System.out.print("Enter the pattern: ");
        pattern = in.nextLine();
    }

    public void checkPattern(){
        int len = pattern.length();
        ArrayList<Character> plist = new ArrayList<>();
        char[] chArray = new char[len];
        int[] l = new int[len];

        for (int i = 0; i < len; i++){
            char ch = pattern.charAt(i);
            chArray[i] = ch;
            if (plist.contains(ch)) {
                int index = plist.indexOf(ch);
                l[index] += 1;
                chArray[i] = ch;
            }
            else{
                plist.add(ch);
                chArray[i] = ch;
                l[i]+=1;
            }
        }
        for(String s : list){
            for (int i=0; i<s.length(); i++){
                char ch = s.charAt(i);

            }
        }
    }
}
