import java.util.*;

public class Dfs {

    static String s;
    static HashSet<String> dict;
    static ArrayList<String> ans;

    static void solve(int index, String sentence) {

        if (index == s.length()) {
            ans.add(sentence.trim());
            return;
        }

        for (int i = index + 1; i <= s.length(); i++) {

            String word = s.substring(index, i);

            if (dict.contains(word)) {

                if (sentence.length() == 0)
                    solve(i, word);
                else
                    solve(i, sentence + " " + word);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int n = sc.nextInt();

            dict = new HashSet<>();

            for (int i = 0; i < n; i++) {
                dict.add(sc.next());
            }

            s = sc.next();

            ans = new ArrayList<>();

            solve(0, "");

            Collections.sort(ans);

            for (String str : ans) {
                System.out.println(str);
            }
        }

        sc.close();
    }
}