import java.util.*;

class AssignCookies {
    // Function to find the maximum number of content students
    public int findContentChildren(int[] student, int[] cookie) {
        // Sort both arrays to apply the greedy strategy
        Arrays.sort(student);
        Arrays.sort(cookie);

        int studentIndex = 0;
        int cookieIndex = 0;

        // Try to assign cookies until any one list is fully processed
        while (studentIndex < student.length && cookieIndex < cookie.length) {
            // If the cookie satisfies the student's greed
            if (cookie[cookieIndex] >= student[studentIndex]) {
                studentIndex++;
            }
            // Move to next cookie in both cases
            cookieIndex++;
        }

        // Number of students satisfied is equal to studentIndex
        return studentIndex;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] student = {1, 2, 3};
        int[] cookie = {1, 1};

        // Create AssignCookies object
        AssignCookies solver = new AssignCookies();

        // Get the number of content students and print it
        int result = solver.findContentChildren(student, cookie);
        System.out.println("Maximum number of content students: " + result);
    }
}
