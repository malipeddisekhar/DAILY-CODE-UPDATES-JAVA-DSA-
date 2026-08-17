import java.util.*;

public class ReverseNode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 0; i + k <= n; i += k) {

            int left = i;
            int right = i + k - 1;

            while (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;

                left++;
                right--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i > 0)
                System.out.print(" ");

            System.out.print(a[i]);
        }
    }
}