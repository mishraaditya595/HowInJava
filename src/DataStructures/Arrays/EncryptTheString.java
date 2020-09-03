/*
An English text needs to be encrypted. Follow the example to get how the string is encrypted.

Eg: The string "feedthedog" is of 10 characters long. Square root of 10 lies between 2 & 3
hence, number of rows in the grid will be 2 while columns will be 3. The grid will look like:
f e e d
t h e d
o g
The encrypted output will be "fto ehg ee dd"
<Note: Input string does not contain any white spaces.>

Try for other test cases as well:
Input: haveaniceday
Output: hae and via ecy

Input: goodnight
Output: gdg onh oit
 */
package DataStructures.Arrays;

import java.util.Scanner;

public class EncryptTheString {

    private static String encryption(String s) {
        int len = s.length();
        double dim = Math.sqrt(len);
        int rows = (int) Math.floor(dim);
        int col = (int) Math.ceil(dim);
        char[][] matrix = new char[rows][col];
        int c = 0;
        String str = "";

        outer:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                char ch = s.charAt(c);
                matrix[i][j] = ch;
                c++;
                if (c == len)
                    break outer;
            }
        }

        for (int i = 0; i < col; i++){
                for (int j = 0; j < rows; j++){
                    if (matrix[j][i] == ' ')
                        break;
                    str += matrix[j][i];
                }
                str += " ";
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string without spaces: ");
        String s = in.next();
        String str = encryption(s);
        System.out.println(str);
    }


}
