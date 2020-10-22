/*
Input: love
Output: love the way
 */
package Probability;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.Key;
import java.util.*;

public class WordPrediction {

    private static ArrayList<String> getList(Scanner scanner) {
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNext())
        {
            String ch = scanner.next();
            if (ch != " ")
            {
                ch = ch.toLowerCase();
                if (ch.endsWith("."))
                {
                    ch = ch.substring(0,ch.length()-1);
                    list.add(ch);
                }
                else
                    list.add(ch);
            }
        }
        return list;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String filepath = "/media/aditya/New Volume/Java Projects/UniversityCoding/src/Probability/Dataset/WordPrediction.txt";
        File file = new File(filepath);
        Scanner scanner = new Scanner(file);
        ArrayList<String> list = getList(scanner);

        System.out.println(list);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = in.next();
        HashMap<String, Integer> map = new HashMap();

        for (int i = 0; i < list.size(); i++)
        {
            String word = list.get(i);

            if (word.equals(str) && i+1 != list.size())
            {
                if (map.containsKey(list.get(i+1)))
                {
                    int value = map.get(list.get(i+1));
                    map.put(list.get(i+1), ++value);
                }
                else
                    map.put(list.get(i+1), 1);
            }
        }

        System.out.println(map);
        for (int i = 0; i < 3; i++)
        {
            String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            System.out.println(key);
            map.remove(key);
        }
    }


}
