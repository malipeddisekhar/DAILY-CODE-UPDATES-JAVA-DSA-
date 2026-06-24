// class Main
// {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int n = arr.length;
//         int sum = 0;

//         for (int i = 0; i < n; i++) {
//             sum =sum + arr[i];
//             // sum += arr[i]; // This is an alternative way to write the same operation
//         }

//         System.out.println("Sum of array elements: " + sum);
//     }
// }

//Second largest element in an array
class Main
{
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int n = arr.length-1;

    if (n < 2) {
        System.out.println("Array must have at least two elements.");
        return;
    }

    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        if (arr[i] > first) {
            second = first;
            first = arr[i];
        } else if (arr[i] > second && arr[i] != first) {
            second = arr[i];
        }
    }

    if (second == Integer.MIN_VALUE) {
        System.out.println("There is no second largest element.");
    } else {
        System.out.println("Second largest element is: " + second);
    }
}
}