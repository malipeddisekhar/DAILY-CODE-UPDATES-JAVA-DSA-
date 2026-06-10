// What is Greedy Algorithm?

// A Greedy Algorithm is a technique where we make the best choice at the current moment and move forward without worrying about future choices.

// In simple words:

// "Take the best option available right now."

// The hope is that these local best choices will lead to the overall best solution.

// Real-Life Example

// Imagine you have ₹270 and currency notes:

// ₹100, ₹50, ₹20

// To use the minimum number of notes:

// Take ₹100 (largest possible)
// Take ₹100
// Take ₹50
// Take ₹20

// Total = ₹270

// Here, every time you picked the largest note possible.

// This is a Greedy approach.

// Job Sequencing Example

// Jobs:

// Job	Profit
// A	100
// B	50
// C	20

// Greedy thinking:

// Which job gives maximum profit now?

// Answer:

// Job A (100)

// Pick it first.

// Then choose the next highest profit job.

// class Job{

//     public static void main(String[] args) {

//         int deadline[] = {2, 1, 2, 1, 1};
//         int profit[] = {100, 19, 27, 25, 15};

//         int n = deadline.length;

//         // Sort by profit (Descending)
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {

//                 if (profit[i] < profit[j]) {

//                     int tempProfit = profit[i];
//                     profit[i] = profit[j];
//                     profit[j] = tempProfit;// Swap profits

//                     int tempDeadline = deadline[i];
//                     deadline[i] = deadline[j];
//                     deadline[j] = tempDeadline;// Swap deadlines sorting by profit
//                 }
//             }
//         }

//         int maxDeadline = 0;

//         for (int i = 0; i < n; i++) {
//             if (deadline[i] > maxDeadline) {
//                 maxDeadline = deadline[i];
//             }
//         }

//         int slots[] = new int[maxDeadline];

//         for (int i = 0; i < maxDeadline; i++) {
//             slots[i] = -1;
//         }

//         int count = 0;
//         int totalProfit = 0;

//         for (int i = 0; i < n; i++) {

//             for (int j = deadline[i] - 1; j >= 0; j--) {

//                 if (slots[j] == -1) {
//                     slots[j] = profit[i];
//                     count++;
//                     totalProfit += profit[i];
//                     break;
//                 }
//             }
//         }

//         System.out.println("Jobs Done = " + count);
//         System.out.println("Total Profit = " + totalProfit);
//     }
// }



//Another code for Job Sequencing Problem
import java.util.*;

class Job {
    public static void main(String[] args) {

        int jobs[][] = {
            {2, 100},
            {1, 19},
            {2, 27},
            {1, 25},
            {3, 15}
        };

        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

        int maxDeadline = 0;

        for (int job[] : jobs) {
            maxDeadline = Math.max(maxDeadline, job[0]);
        }

        int slots[] = new int[maxDeadline];
        Arrays.fill(slots, -1);

        int count = 0;
        int totalProfit = 0;

        for (int job[] : jobs) {

            int deadline = job[0];
            int profit = job[1];

            for (int j = deadline - 1; j >= 0; j--) {

                if (slots[j] == -1) {
                    slots[j] = profit;
                    count++;
                    totalProfit += profit;
                    break;
                }
            }
        }

        System.out.println("Jobs Done = " + count);
        System.out.println("Profit = " + totalProfit);
    }
}