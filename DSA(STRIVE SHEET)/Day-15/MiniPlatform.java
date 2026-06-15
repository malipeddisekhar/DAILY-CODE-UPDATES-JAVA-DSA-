import java.util.Arrays;

class MiniPlatform {

    public int minPlatform(int arr[], int dep[]) {

        int n = arr.length;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms = 1;
        int result = 1;

        int i = 1;
        int j = 0;

        while (i < n && j < n) {

            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
            } else {
                platforms--;
                j++;
            }

            result = Math.max(result, platforms);
        }

        return result;
    }
}

//GFG solution for minimum number of platforms required at the railway station  