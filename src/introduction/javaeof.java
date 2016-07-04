package introduction; /**
 * Created by edesimone on 03/07/16.
 * "In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)
 The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

 Hint: Java's Scanner.hasNext() method is helpful for this problem.

 Input Format

 Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

 Output Format

 For each line, print the line number, followed by a single space, and then the line content received as input:

 k This is the line read as input for line number 'k'.
 Sample Input

 Hello world
 I am a file
 Read me until end-of-file.
 Sample Output

 1 Hello world
 2 I am a file
 3 Read me until end-of-file.
 */

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class javaeof {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count = 0;

        while (sc.hasNextLine()){

            count++;
            String st = sc.nextLine();

            if (st.equals("quit")) {
                sc.close();
            }else{
                System.out.printf("%d %s\n", count,st);
            }
        }

    }
}