package algorithm;

/**
 * Created by edesimone on 04/07/16.
 */

import java.util.*;
import java.io.*;

public class atendcourse {


    static public List<String> getDirectFriendsForUser(String user) {
        return null;
    }

    static public List<String> getAttendedCoursesForUser(String user) {
        return null;
    }
 /* Please complete the method below */


    static public List<String> getRankedCourses(String user) {
        ArrayList<String> solution = new ArrayList<String>();
        HashMap<String, Integer> recomendation = new HashMap<String, Integer>();
        ArrayList<String> directFriendsForUser1 = (ArrayList<String>) getDirectFriendsForUser(user);
        ArrayList<String> aux = new ArrayList<String>();
        for(String friend : directFriendsForUser1){
            getDifferent(user,friend,recomendation);

            List<String> directFriendsForUser = getDirectFriendsForUser(friend);
            for (String friendOf : directFriendsForUser){
                if (!directFriendsForUser1.contains(friendOf) && !aux.contains(friendOf)){
                    aux.add(friendOf);
                    getDifferent(user,friendOf,recomendation);
                }
            }
        }
        ValueComparator bvc = new ValueComparator(recomendation);
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
        sorted_map.putAll(recomendation);
        for(String key : sorted_map.keySet()){
            solution.add(key);
        }
        return solution;
    }

    static public void getDifferent(String actual, String friend, HashMap<String, Integer> map) {
        List<String> cursoDe = getAttendedCoursesForUser(friend);
        ArrayList<String> propios = (ArrayList<String>) getAttendedCoursesForUser(actual);
        for(String curso: cursoDe){
            if (!propios.contains(curso)){
                if (map.containsKey(curso)){
                    Integer i = map.get(curso)+1;
                    map.put(curso,i);
                } else {
                    map.put(curso,1);
                }
            }
        }
    }

    static class ValueComparator implements Comparator<String> {
        Map<String, Integer> base;

        public ValueComparator(Map<String, Integer> base) {
            this.base = base;
        }

        public int compare(String a, String b) {
            if (base.get(a) >= base.get(b)) {
                return -1;
            } else {
                return 1;
            } // returning 0 would merge keys
        }
    }
}

