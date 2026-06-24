// class Patterns
// {
//     public static void main(String[] args) 
//     {
//         int n = 5;
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=n; j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//output:
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
//============================================================
// class Patterns
// {
//     public static void main(String[] args) 
//     {
//         int n = 5;
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=i; j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//output:
// *
// * *
// * * *
// * * * *
// * * * * *
//============================================================
// class Patterns
// {
//     public static void main(String[] args) 
//     {
//         int n = 5;
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=n-i+1; j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//output:
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
//============================================================
// class Patterns
// {
//     public static void main(String[] args) 
//     {
//         int n = 5;
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=i; j++)
//             {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// // 1 
// // 1 2 
// // 1 2 3 
// // 1 2 3 4 
// // 1 2 3 4 5 
//============================================================
// class Patterns
// {
//     public static void main(String[] args) 
//     {
//         int n = 5;
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=n-i+1; j++)
//             {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
//============================================================
// class Patterns
// {
//     public static void main(String[] args) 
//     {
//         int n = 5;
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=i; j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for(int i=n-1; i>=1; i--)
//         {
//             for(int j=1; j<=i; j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
//============================================================
