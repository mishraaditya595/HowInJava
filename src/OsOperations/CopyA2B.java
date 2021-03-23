package OsOperations;

import java.io.*;
import java.util.Scanner;

public class CopyA2B
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the filename where content is to be copied: ");
        String a = in.nextLine();
        File fileA = new File(a);
        System.out.println("Enter the filename where content is to be pasted: ");
        String b = in.nextLine();
        File fileB = new File(b);
        contentCopy(fileA, fileB);
    }

    private static void contentCopy(File fileA, File fileB) throws IOException
    {
        FileInputStream inputStream = new FileInputStream(fileA);
        FileOutputStream outputStream = new FileOutputStream(fileB);
        try
        {
            int n;
            while ((n = inputStream.read()) !=  -1)
                outputStream.write(n);
        }
        finally
        {
            if (inputStream != null)
                inputStream.close();

            if (outputStream != null)
                outputStream.close();
        }
        System.out.println("File Copied");
    }
}
