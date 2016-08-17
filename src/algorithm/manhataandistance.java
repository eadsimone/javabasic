package algorithm;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by edesimone on 04/07/16.
 */
public class manhataandistance {

    /*This method obtain the minimal Manhattan distance between a specific position and the nearest locker
    * The complexity is O(nm) where n represents the number of total blocks and m the number of lockers*/
    static int[][] getLockerDistanceGrid(int cityLength, int cityWidth, int[] lockerXCoordinates, int[] lockerYCoordinates) {
        int[][] solution = new int[cityLength][cityWidth];
        /* For each position in the city*/
        for (int i=0; i< cityLength; i++){
            for(int j=0; j<cityWidth; j++){
            /* search the nearest locker*/
                for(int k=0; k<lockerXCoordinates.length; k++){
                    if (k==0)
                        solution[i][j] = Math.abs(i-(lockerXCoordinates[k]-1)) + Math.abs(j-(lockerYCoordinates[k]-1));
                    else {
                        if(Math.abs(i-(lockerXCoordinates[k]-1)) + Math.abs(j-(lockerYCoordinates[k]-1))<solution[i][j])
                            solution[i][j] = Math.abs(i-(lockerXCoordinates[k]-1)) + Math.abs(j-(lockerYCoordinates[k]-1));
                    }
                }
            /*after traverse all the lockers print the minimal distance*/
                System.out.print(solution[i][j]);
            }
            System.out.println();
        }
        return solution;
    }


    public static void main(String[] args) {

        int lenght = 3;
        int widht = 5;
        int[] xcoor = {1};
        int[] ycoor = {1};

//        int lenght = 5;
//        int widht = 7;
//        int[] xcoor = {2,4};
//        int[] ycoor = {3,7};

        int[][] res = getLockerDistanceGrid(lenght,widht,xcoor,ycoor);
    }
}
