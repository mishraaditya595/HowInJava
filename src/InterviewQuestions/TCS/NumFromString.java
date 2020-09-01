/*
You need to find only those numbers which do not contain 9.
For eg, if the string contains "hello this is alpha 5051 and 9475", You will extract 5051 and not 9475.
 */
package InterviewQuestions.TCS;

import java.util.Scanner;

public class NumFromString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = in.nextLine(); str+=" ";
        String wrd = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch)){
                wrd += ch;
            }
            else
            {
                int count = 0;
                String num = "";
                for (int j = 0; j < wrd.length(); j++){
                    char c = wrd.charAt(j);
                    if (Character.isDigit(c)) {
                        num += c;
                        count++;
                    }
                    if (c == '9'){
                        count = 0;
                        break;
                    }
                }
                if (count>0)
                    System.out.println(num);
                wrd = "";
            }
        }
    }
}
