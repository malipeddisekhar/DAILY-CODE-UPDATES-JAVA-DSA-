import java.util.Arrays;
class N_mettings
{
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        maxMeetings(start, end, n);
    }
    
    public static void maxMeetings(int start[], int end[], int n) {
        // Implementation for finding maximum number of meetings
        int[][] meetings = new int[n][2];
        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }
        Arrays.sort(meetings, (a, b) -> a[1] - b[1]); // Sort by end time
        int count = 1;
        int lastEnd = meetings[0][1];
        for (int i = 1; i < n; i++) {
            if (meetings[i][0] >= lastEnd) {
                count++;
                lastEnd = meetings[i][1];
            }
        }
        System.out.println("Maximum number of meetings: " + count);
    }
}