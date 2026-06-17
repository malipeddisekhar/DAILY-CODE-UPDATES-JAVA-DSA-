import java.util.*;
class Combination {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

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

        if(index == arr.length) {
            return;
        }

        // Take
        if(arr[index] <= target) {

            path.add(arr[index]);

            solve(index,
                  arr,
                  target - arr[index],
                  path,
                  ans);

            path.remove(path.size() - 1);
        }

        // Not Take
        solve(index + 1,
              arr,
              target,
              path,
              ans);
    }
    public static void main(String[] args) {
        Combination combination = new Combination();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combination.combinationSum(candidates, target);
        System.out.println(result);
    }
}