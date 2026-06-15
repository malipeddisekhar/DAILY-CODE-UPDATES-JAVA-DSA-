import java.util.*;

class job {

    private static int find(int[] parent, int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent, parent[x]);
    }

    private static void union(int[] parent, int u, int v) {
        int pu = find(parent, u);
        int pv = find(parent, v);

        parent[pu] = pv;
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;

        int[][] jobs = new int[n][2];

        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];

            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

        int[] parent = new int[maxDeadline + 1];

        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int count = 0;
        int totalProfit = 0;

        for (int[] job : jobs) {

            int deadlineSlot = job[0];

            int availableSlot = find(parent, deadlineSlot);

            if (availableSlot > 0) {

                count++;
                totalProfit += job[1];

                union(parent, availableSlot,
                             availableSlot - 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(count);
        ans.add(totalProfit);

        return ans;
    }
}//GFG previous soved i am struggling to solve this problem i will try to solve it in future.....