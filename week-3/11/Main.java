// class Pre{
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5 };// Theseis creation of an array
//         int[] prefix = new int[arr.length];// That array elemets are stored into the prefix array
//         prefix[0] = arr[0];// The first element of the prefix array is assigned the value of the first
//                            // element of the original array
//         for (int i = 1; i < arr.length; i++) {
//             prefix[i] = prefix[i - 1] + arr[i];// The current element of the prefix array is assigned the sum of the
//                                                // previous element of the prefix array and the current element of the
//                                                // original array
//         }
//         for (int i = 0; i < prefix.length; i++) {
//             System.out.print(prefix[i] + " ");// The elements of the prefix array are printed to the console, separated
//                                               // by a space
//         }

//     }
// }
//===============================================
import java.util.*;

class Main {
      public static void main(String[] args) {

        String s = "abciiidef";

        int[][] queries = {{ 0, 4 },{ 1, 3 },{ 2, 5 }};

        System.out.println(
                Arrays.toString(
                        vowelsCount(s, queries)));
    }

    static int[] vowelsCount(String s, int[][] queries) {

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int[] prefix = new int[s.length() + 1];

        for (int i = 1; i <= s.length(); i++) {

            if (vowels.contains(s.charAt(i - 1)))
                prefix[i] = prefix[i - 1] + 1;
            else
                prefix[i] = prefix[i - 1];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            ans[i] = prefix[r + 1] - prefix[l];
        }

        return ans;
    }
}