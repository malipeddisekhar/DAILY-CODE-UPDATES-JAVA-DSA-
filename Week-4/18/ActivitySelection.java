// import java.util.*;
// class ActivitySelection {
//     static int maxActivities(int activities[][]) {
//         Arrays.sort(activities, (a, b) -> a[1] - b[1]);//a`nd b are two activities and we are sorting them based on their end time.
//         int count = 1;// Count the first activity
//         int lastEnd = activities[0][1];
//         for (int i = 1; i < activities.length; i++) {
//             if (activities[i][0] >= lastEnd) {
//                 count++;
//                 lastEnd = activities[i][1];
//             }
//         }

//         return count;
//     }
//     public static void main(String[] args) {

//         int activities[][] = {
//             {10, 20},//20 is the end time of first activity
//             {12, 25},
//             {20, 30}
//         };

//         System.out.println("Maximum Activities = "
//                            + maxActivities(activities));
//     }
// }


//===================================
//leetcode problem 
import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int remove = 0;
        int lastEnd = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {

            if(intervals[i][0] < lastEnd) {
                remove++;
            } else {
                lastEnd = intervals[i][1];
            }
        }

        return remove;
    }
}