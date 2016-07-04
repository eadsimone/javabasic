package algorithm.shortestsubstringonlyonce;

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
    public <T> T[] shortestSubstring(T[] a) {

        T[] solution  = new T[a.length];
        int totalLenght = A.length() ;
        for ( int currentLenght = totalLenght; currentLenght > 0; currentLenght--){
            for (int initialIndex = 0; initialIndex <= (totalLenght - currentLenght); initialIndex++){

                String currentSubstring= (String)A.substring(initialIndex, currentLenght);
//                currentSubstring= substr($A, $initialIndex, $currentLenght);

                if (numberOfOccurrences(A, currentSubstring) == 1){
                    $solution =$currentSubstring;
                }
            }
        }
        return $solution;
    }
    public static int numberOfOccurrences(<T>[]s, String pattern) {
        int ocurrences = 0;
        for ( int initialIndex = 0; initialIndex < s.length() - pattern.length() + 1; initialIndex++){
            if ( s.substring(initialIndex, pattern.length())==pattern)
                ocurrences++;
        }
        return ocurrences;
    }

    public static void main(String[] args) {



        String stringofword= new String("aabbabbaab");

        shortestSubstringOnlyOnce sss=new shortestSubstringOnlyOnce();

        sss.shortestSubstring();

        $string="aabbabbaab";
//$string="aaaaa";
        $sol=shortestSubstring($string);
        echo $sol;//$sol;


        $sol=shortestSubstring($string);
        echo $sol;//$sol;


//         Solution.merge(intervalos);
//        si queres imprimir la solucion
//        hace
        mergeintervals  sol= new mergeintervals();
//        Function<List, List> merger = sol::merge;

        List<Interval> inter = sol.merge(intervalos);

        for (Interval a: inter){
            System.out.println("First: " + a.start + " end: " + a.end);
        }
    }


}
