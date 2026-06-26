// class Tcs {
//     public int numSpecial(int[][] mat) {
//         int m = mat.length;
//         int n = mat[0].length;
//         int[] row = new int[m];
//         int[] col = new int[n];
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (mat[i][j] == 1) {
//                     row[i]++;
//                     col[j]++;
//                 }
//             }
//         }
//         int count = 0;
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }
//     public static void main(String[] args) {
//         Tcs tcs = new Tcs();
//         int[][] mat = {{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
//         System.out.println(tcs.numSpecial(mat));
//     }
// }



// public class Tcs {

//     public static void main(String[] args) {

//         int[][] matrix = {
//                 {0,1,0},
//                 {1,1,0},
//                 {1,1,1}
//         };

//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         int maxCount = 0;
//         int rowIndex = -1;

//         for(int i = 0; i < rows; i++) {

//             int count = 0;

//             for(int j = 0; j < cols; j++) {

//                 if(matrix[i][j] == 1) {
//                     count++;
//                 }
//             }

//             if(count > maxCount) {
//                 maxCount = count;
//                 rowIndex = i;
//             }
//         }

//         System.out.println("Row Index = " + rowIndex);
//         System.out.println("Maximum Ones = " + maxCount);
//     }
// }






//========================================================
class Tcs {
    public boolean detectCapitalUse(String word) {

        int upper = 0;

        for(int i = 0; i < word.length(); i++) {

            if(Character.isUpperCase(word.charAt(i))) {
                upper++;
            }
        }

        if(upper == word.length())
            return true;

        if(upper == 0)
            return true;

        if(upper == 1 && Character.isUpperCase(word.charAt(0)))
            return true;

        return false;
    }
    public static void main(String[] args) {
        Tcs tcs = new Tcs();
        String word = "USA";
        System.out.println(tcs .detectCapitalUse(word));
    }
}