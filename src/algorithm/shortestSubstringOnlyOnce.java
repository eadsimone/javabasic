package algorithm;

/**
 * Created by edesimone on 04/07/16.
 */

/**
 * Created by edesimone on 04/07/16.
 */
public class shortestSubstringOnlyOnce {

    /*
* Given a string s (1<=s.length()<=1000), return the shortest substring that is
* only occurring once.
* Examples:
* s="aabbabbaab" gives either "bab" or "baa"
* s="aaaa" gives "aaaa"
*/
//O(NM)
    //public <T> T[] shortestSubstring(T[] a) {
    public String shortestSubstring(String a) {

        String solution  = new String();
        int totalLenght = a.length() ;
        for ( int currentLenght = totalLenght; currentLenght > 0; currentLenght--){
            for (int initialIndex = 0; initialIndex <= (totalLenght - currentLenght); initialIndex++){

                int endIndex=(initialIndex + currentLenght);

                if(endIndex<=a.length()) {
                    String currentSubstring = a.substring(initialIndex, endIndex);
//                currentSubstring= substr($A, $initialIndex, $currentLenght);

                    if (numberOfOccurrences(a, currentSubstring) == 1) {
                        solution = currentSubstring;
                    }
                }
            }
        }
        return solution;
    }
    public static int numberOfOccurrences(String s, String pattern) {
        int ocurrences = 0;
        for ( int initialIndex = 0; initialIndex < (s.length() - pattern.length() + 1); initialIndex++){
            int endIndex=(initialIndex+pattern.length());
            if(endIndex<=s.length()) {
                String compa = s.substring(initialIndex, endIndex);
                //if (compa==pattern)
                if(compa.equals(pattern))
                    ocurrences++;
            }
        }
        return ocurrences;
    }

    public static void main(String[] args) {


        //String stringofword= new String("aabbabbaab");
//        String[] thisIsAStringArray = {"AAA", "BBB", "CCC", "DDD", "EEE"};

        //String[] stringofword = {"a","a","b","b","a","b","b","a","a","b"}

        String stringofword= new String("aabbabbaab");


//        String tester= new String("abcdef");
////        echo substr('abcdef', 1, 3);  // bcd
//        String a= tester.substring(1, 1+3);
////        echo substr('abcdef', 0, 4);  // abcd
//        String b= tester.substring(0, 0+4);
////        echo substr('abcdef', 0, 8);  // abcdef
//        String c= tester.substring(0, 0+6);

        shortestSubstringOnlyOnce sss=new shortestSubstringOnlyOnce();

        String solu = sss.shortestSubstring(stringofword);

        System.out.println("First: " + solu);

    }


}
