package algorithm;

/**
 * Created by edesimone on 04/07/16.
 */

import java.util.*;

public class MergerSort{

    public static void main(String[] args)
    {
        //Unsorted array
        Integer[] a = { 2, 6, 3, 5, 1 };

        //Call merge sort
        mergeSort(a);

        //Check the output which is sorted array
        System.out.println(Arrays.toString(a));
    }

    @SuppressWarnings("rawtypes")
    public static Comparable[] mergeSort(Comparable[] list)
    {
        //If list is empty; no need to do anything
        if (list.length <= 1) {
            return list;
        }

        //Split the array in half in two parts
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        //Sort each half recursively
        mergeSort(first);
        mergeSort(second);

        //Merge both halves together, overwriting to original array
        merge(first, second, list);
        return list;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result)
    {
        //Index Position in first array - starting with first element
        int iFirst = 0;

        //Index Position in second array - starting with first element
        int iSecond = 0;

        //Index Position in merged array - starting with first position
        int iMerged = 0;

        //Compare elements at iFirst and iSecond,
        //and move smaller element at iMerged
        while (iFirst < first.length && iSecond < second.length)
        {
            if (first[iFirst].compareTo(second[iSecond]) < 0)
            {
                result[iMerged] = first[iFirst];
                iFirst++;
            }
            else
            {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }
}
//Output:
//
//        Input Array :  [ 2, 6, 3, 5, 1, 1, 8 ]
//        Output Array : [ 1, 1, 2, 3, 5, 6, 8 ]
//
//        Input Array :  [ 12, 16, 333, 50, 1000, 5, 897, 1, 3, 66, 13 ]
//        Output Array : [ 1, 3, 5, 12, 13, 16, 50, 66, 333, 897, 1000 ]
