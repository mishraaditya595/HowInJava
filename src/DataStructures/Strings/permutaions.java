/*
In a permutation string it helps to find all possible ways of representing the string 
 */
import java.util.Collections;
import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();

        ArrayList<String> answer = allPermutation(str);
        Collections.sort(answer);
        System.out.println(answer);

    }

    public static ArrayList<String> allPermutation(String str) {

        if (str.length()==0){
            ArrayList<String> baseResult= new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char ch = str.charAt(0);
        String rest = str.substring(1);

        ArrayList<String> recResult = allPermutation(rest);
        ArrayList<String> myResult = new ArrayList<>();
        for (int i = 0; i < recResult.size(); i++) {
            String s = recResult.get(i);
            for (int j = 0; j <= s.length(); j++) {
                String newString = s.substring(0, j) + ch + s.substring(j);
                myResult.add(newString);
            }
        }
        return myResult;
    }
}