import java.util.*;

public class mergeInterval{

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
        return intervals;

    Arrays.sort(intervals, new Comparator<int[]>() {
        @Override
        public int compare(int[] a, int[] b) {
            return a[0] - b[0];
        }
    });

    List<int[]> result = new ArrayList<>();
    int[] newInterval = intervals[0];

    for (int[] interval : intervals) {
        if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
            newInterval[1] = Math.max(newInterval[1], interval[1]);
        else {                             
    
            
            result.add(newInterval);
            newInterval = interval;
        }
    }
    result.add(newInterval);

    return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args){

    }
}