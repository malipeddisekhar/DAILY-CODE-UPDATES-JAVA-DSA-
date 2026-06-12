// //fibonacci series using dp
// class Dp{
   
//     public static int fib(int n, int[] dp){
//         if(n <= 1){
//             return n;
//         }
//         if(dp[n] != 0){
//             return dp[n];//These is the memoization part where we are checking if the value is already calculated or not if it is calculated then we are returning the value from the dp array and if it is not calculated then we are calculating the value and storing it in the dp array and returning the value.
//         }
//         dp[n] = fib(n-1, dp) + fib(n-2, dp);
//         return dp[n];
//     }
//      public static void main(String[] args) {
//         int n = 5;
//         int[] dp = new int[n+1];
//         System.out.println(fib(n, dp));
//     }
// }

//Memoization by using the hashMap
// import java.util.HashMap;
// class Dp
// {
//     HashMap<Integer, Integer> map = new HashMap<>();
//     public int fib(int n){
//         if(n <= 1){
//             return n;
//         }
//         if(map.containsKey(n)){
//             return map.get(n);
//         }
//         int ans = fib(n-1) + fib(n-2);
//         map.put(n, ans);
//         return ans;
//     }
//      public static void main(String[] args) {
//         Dp dp = new Dp();
//         int n = 3;
//         System.out.println(dp.fib(n));
//      }
// }

// //Tabulation method
// class Dp
// {
//   public static int fib(int n)
//   {
//     int[] dp=new int[n+1];//These is the tabulation part where we are creating a dp array and storing the values in the dp array and returning the value from the dp array.
//     dp[0]=0;
//     dp[1]=1;
//     for(int i=2; i<=n; i++)
//     {
//       dp[i]=dp[i-1]+dp[i-2];
//     }
//     return dp[n];
//   }
//   public static void main(String[] args) {
//     int n = 5;
//     System.out.println(fib(n));
//   }
// }



//Tabulation method using factorial
// class Dp
// {
//   public static int fact(int n)
//   {
//     int[] dp=new int[n+1];
//     dp[0]=1;
//     for(int i=1; i<=n; i++)
//     {
//       dp[i]=i*dp[i-1];
//     }
//     return dp[n];
//   }
//   public static void main(String[] args) {
//     int n = 1;
//     System.out.println(fact(n));
//   }
// }



//factorial using memoization
class Dp
{
  int[] dp;
  public int fact(int n)
  {
    if(n==0)
    {
      return 1;
    }
    if(dp[n]!=0)
    {
      return dp[n];//memoization part where we are checking if the value is already calculated or not if it is calculated then we are returning the value from the dp array and if it is not calculated then we are calculating the value and storing it in the dp array and returning the value.
    }
    dp[n]=n*fact(n-1);
    return dp[n];
  }
  public static void main(String[] args) {
    Dp dp = new Dp();
    int n = 5;
    dp.dp = new int[n+1];
    System.out.println(dp.fact(n));
  }
}