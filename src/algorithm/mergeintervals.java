package algorithm; /**
 * Created by edesimone on 04/07/16.

 * Given a collection of intervals, merge all overlapping intervals.
 * For example, Given [1,3],[2,6],[8,10],[15,18], return [1,6],[8,10],[15,18].

 */


import java.util.*;


public class mergeintervals {
    //Definition for an interval.
    static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    static class IntervalComparator implements Comparator<Interval>{
        public int compare(Interval o1, Interval o2){
            return o1.start - o2.start;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() == 0)
            return intervals;
        if(intervals.size() == 1)
            return intervals;

        /*Big-O time complexity O(N*log(N)).*/
        Collections.sort(intervals, new IntervalComparator());

        Interval first = intervals.get(0);
        int start = first.start;
        int end = first.end;

        ArrayList<Interval> result = new ArrayList<Interval>();

        /*Big-O time complexity O(N).*/
        for(int i = 1; i < intervals.size(); i++){
            Interval current = intervals.get(i);
            if(current.start <= end){
                end = Math.max(current.end, end);
            }else{
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }

        }

        result.add(new Interval(start, end));

        return result;

    }

    public static void main(String[] args) {

        ArrayList<Interval> intervalos = new ArrayList<Interval>();
        intervalos.add(new Interval(1,3));
        intervalos.add(new Interval(2,6));
        intervalos.add(new Interval(8,10));
        intervalos.add(new Interval(15,18));

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

