import java.util.*;
class Combination2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        solve(0, candidates, target,
              new ArrayList<>(), ans);

        return ans;
    }

    private void solve(int index,
                       int[] arr,
                       int target,
                       List<Integer> path,
                       List<List<Integer>> ans) {

        if(target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i = index; i < arr.length; i++) {

            // Skip duplicates
            if(i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            if(arr[i] > target) {
                break;
            }

            path.add(arr[i]);

            solve(i + 1,
                  arr,
                  target - arr[i],
                  path,
                  ans);

            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        Combination2 combination2 = new Combination2();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> result = combination2.combinationSum2(candidates, target);
        System.out.println(result);
    }
}




