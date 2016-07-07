package introduction; /**
 * Created by edesimone on 02/07/16.
 * In this problem you will test your knowledge of Java loops. Given three integers , , and , output the following series:

 a+2°b,a+2°b+2¹b....,a+2°b+2¹b+..+2n-1b

 Input Format

 The first line will contain the number of testcases t. Each of the next  lines will have three integers, , , and .

 Constraints:
 0<= t <=500
 0<= a,n <=50
 0<= n <=15


 Output Format

 Print the answer to each test case in separate lines.

 Sample Input

 2
 0 2 10
 5 3 5
 Sample Output

 2 6 14 30 62 126 254 510 1022 2046
 8 14 26 50 98
 Explanation

 In the first case:

 1st term=0+1*2=2
 2nd term=0+1*2+2*2=6
 3rd term=0+1*2+2*2+4*2=14
 and so on.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaLoops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();


        for(int i=0;i<cases;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            getResult(a,b,n);
            System.out.println();
        }
    }

    private static void getResult(int a,int b,int n ){

        int result =0 ;
        int x = 2;

        for(int i=0;i<n;i++)
        {
            result += (int)Math.pow(x, i) * b;

            System.out.printf("%d ", a+result);
        }
    }
}