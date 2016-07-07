package introduction; /**
 * Created by edesimone on 03/06/16.
 *
 * Using "if-else" you can perform decision making in Java. See the flowchart below (taken from wikipedia):

 332px-If-Then-Else-diagram.svg.png

 This problem will test your knowledge on "if-else" statements.

 Given an integer  as input, check the following:

 If  is odd, print "Weird".
 If  is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
 If  is even and, in between the range of 6 and 20(inclusive), print "Weird".
 If  is even and , print "Not Weird".
 We given you partially completed code in the editor, complete it to solve the problem.

 Input Format

 There is a single line of input: integer .

 Constraints


 Output Format

 Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not print the quotation marks.

 Sample Input 1

 3
 Sample Output 1

 Weird
 Sample Input 2

 24
 Sample Output 2

 Not Weird
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
if (number % 2 == 0) {
        // even
        } else {
        // odd
        }
*/

public class ifelse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1){
            ans = "Weird";
        }
        else
        if(n>2 && n<=5){
            ans = "Not Weird";
        }else
        if(n>6 && n<=20){
            ans = "Weird";
        }else
        if(n>20){
            ans = "Not Weird";
        }
        System.out.println(ans);

    }
}
