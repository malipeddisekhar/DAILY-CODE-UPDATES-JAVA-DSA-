
// class Matrix{

//     public static int[][] transpose(int[][] mat) {
//         int row=mat.length;
//         int col=mat[0].length;
//         int [][] res= new int[col][row];
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 res[j][i] = mat[i][j];
//             }
//         }
//         return res;
//     }

    
//     public static int[][] reverse(int[][] mat) {
//         int n = mat.length;
//         // int [][] res = new  int [n][n];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n / 2; j++) {
//                 int temp = mat[i][j];
//                 mat[i][j] = mat[i][n - 1 - j];
//                 mat[i][n - 1 - j] = temp;
//             }
//         }
//         return mat;
//     }
//     public static void main(String[] args) {
//         int[][] mat = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//         };
//         int[][] res = transpose(mat);
// System.out.println(" The transpose of the matrix is : ");
//         for (int[] row : res) {
//             for (int elem : row) {
//                 System.out.print(elem + " ");
//             }
//             System.out.println();
//         }
//         System.err.println(" After reversing the matrix : ");
//         for (int[] row : reverse(res)) {
//             for (int elem : row) {
//                 System.out.print(elem + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// class Matrix{
//     public static void main(String[] args) {
//         int[][] mat = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//         };

//         int row = mat.length;
//         int col = mat[0].length;
//         int [][] res = new int[col][row];
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 res[j][i] = mat[i][j];
//             }
//         }
//         for (int[] row1 : res) {
//             for (int elem : row1) {
//                 System.out.print(elem + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// //enhanced for loop
// class Matrix{
//     public static void main(String[] args) {
//         int[] mat = {1,2,3,4,5};

//         for (int elem : mat) {
//             System.out.print(elem + " ");
//         }
//         System.out.println();
//     }
// }

//Sum of elements
class Matrix{
    public static void main(String[] args) {
        int[] mat = {1,2,3,4,5};
        int sum=0;
        for (int elem : mat) {
            sum+=elem;
        }
        System.out.println("The sum of the elements in the array is : "+sum); 
    }
}