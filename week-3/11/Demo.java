//Print matrix in number sequence
// import java.util.Scanner;
// class Demo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the matrix (n x n): ");
//         int n = sc.nextInt();
//         int[][] matrix = new int[n][n];
        
//         int num = 1; 
        
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n-1; j++) {
//                 matrix[i][j] = num++;
//             }
//         }
        
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n-1; j++) {
//                 System.out.print(matrix[i][j] + "\t");
//             }
//             System.out.println();
//         }
 
//     }

// }

//==============================================
//When i am giving the k-3 then i am enter to print that formate dmanner
import java.util.Scanner;

 class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (k x k): ");
        int k = sc.nextInt();
        int[][] matrix = new int[k][k-1];

        // Input matrix elements
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k-1; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k-1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
 }