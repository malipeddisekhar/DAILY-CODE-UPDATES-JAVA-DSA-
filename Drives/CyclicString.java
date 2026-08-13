import java.util.*;

public class CyclicString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        int count = 0;
        String temp = B;

        for (int i = 0; i < B.length(); i++) {

            if (temp.equals(A)) {
                count++;
            }

            // Rotate B left by one position
            temp = temp.substring(1) + temp.charAt(0);
        }

        System.out.println(count);

        sc.close();
    }
}