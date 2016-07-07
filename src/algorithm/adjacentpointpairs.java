package algorithm;

/**
 * Created by edesimone on 04/07/16.

 The method named pairs that will count the number of pairs (2 identical adjacent numbers) that are in the array.
 Three in succession constitute only 1 pair. Four in succession will be 2 pairs.

 You have a function foo(int a, int b) that returns true if 'a' is "adjacent" to 'b' and false if 'a' is not adjacent to 'b'.
 You have an array such as this [1,4,5,9,3,2,6,15,89,11,24], but in reality has a very long length, like 120, and will be repeated over and over
 (its a genetic algorithm fitness function) which is why efficiency is important.

 I want a function that returns the length of each possible 'list' of adjacencies in the array, but not including the 'lists' which simply subsets of a larger list.

 For example, if foo(1,4) -> true, foo(4,5) -> true, foo(5,9)-> false, foo(9,3) & foo(3,2) & foo(2,6), foo(6,15) -> true,
 then there are 'lists' (1,4,5) and (9,3,2,6), so length 3 and 4.
 I don't want it to return (3,2,6), though, because this is simply a subset of 9,3,2,6.

 //codility 3 start
 //O(n) time
 */

import java.io.*;
import java.util.*;

//ESTA MALLLL no esta completo!!!!!
public class adjacentpointpairs {


    public static int  adjacent_point_pairs (int[] a) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        int total=0;
        int is_par=-1;
        //int[] $is_par;

        for(int i=0;i<a.length;i++) {
            if (i!=is_par) {
                if (a[i]==a[i+1]) {
                    is_par=i+1;
                    total++;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        //$A=array(1,4,5,9,3,2,6,15,89,11,24);
        int[] anArray = {1,4,4,2,2,2,6,15,11,11,11};
        //A[]=array(1,4,4,2,2,2,6,15,11,11,11);//2 pairs
        System.out.println( adjacent_point_pairs(anArray));

    }
}


