import java.util.Arrays;

class Info {
    public static void main(String[] args) {

        int[] arr = {5, 20, 8, 4, 12, 6};
        int k = 3;

        Arrays.sort(arr);

        int sum = 0;

        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}

//The kth largest 3 elements in the array are 12, 20, and 8. The sum of these elements is 40.