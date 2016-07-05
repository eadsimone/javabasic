package algorithm;

/**
 * Created by edesimone on 04/07/16.
 */
import java.util.*;
public class palindrome {

    public boolean isPalindrome(String a){
        String testword = a.toLowerCase();
        //testword = preg_replace( '/[^\sa-z0-9]/', '', testword );
        testword = testword.replaceAll("/[^\\sa-z0-9]/"," ");

        StringBuffer buffer = new StringBuffer(testword);
        String wordr =  buffer.reverse().toString();
        if(testword.equals(wordr)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String palindro = "madam tn madam";

        palindrome p = new palindrome();
        boolean valid = p.isPalindrome(palindro);

    }
}
