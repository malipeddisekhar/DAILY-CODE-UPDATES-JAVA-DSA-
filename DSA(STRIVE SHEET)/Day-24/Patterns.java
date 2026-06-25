// class Patterns
// {
//     public static void main(String[] args) 
//     {
//         int n = 5;
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=0; j<3; j++)
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
// class Patterns
// {
//     public static void main(String[] args)
//     {
//         int n=5;
//         for(int i=0;i<n;i++)
//         {
//             //space 
//             for(int j=0;j<=n-i-1;j++)
//             {
//                 System.out.print(" ");
//             }
//             //star
//             for(int j=0;j<2*i+1;j++) 
//             {
//                 System.out.print("*");
//             }
//             //space
//             for(int j=0;j<n-i-1;j++)
//             {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }
// //output:
//      *    
//     ***   
//    *****  
//   ******* 
//  *********
//============================================================
// class 
// {
//     public static void main(String[] args)
//     {
//      int n=5;
//              for(int i=0;i<n;i++)
//         {
//             //space 
//             for(int j=0;j<=n-i-1;j++)
//             {
//                 System.out.print(" ");
//             }
//             //star
//             for(int j=0;j<2*i+1;j++) 
//             {
//                 System.out.print("*");
//             }
//             //space
//             for(int j=0;j<n-i-1;j++)
//             {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//      for(int i=0;i<n;i++)
//         {
//             //space 
//             for(int j=0;j<i;j++)
//             {
//                 System.out.print(" ");
//             }
//             //star
//             for(int j=0;j<2*n-2*i-1;j++) 
//             {
//                 System.out.print("*");
//             }
//             //space
//             for(int j=0;j<i;j++)
//             {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }
//============================================================
// class Patterns
// {
//     public static void main(String[] args)
//     {
//         int n=5;
//         int star=1;
//         for(int i=0;i<n;i++)
//         {
//           if(i%2==0)
//           {
//             for(int j=0;j<star;j++)
//             {
//                 System.out.print("*");
//             }
//             star++;
//           }
//           else
//           {
//             for(int j=0;j<star;j++)
//             {
//                 System.out.print("#");
//             }
//             star++;
//           }
//             System.out.println();
//         }
//     }
// }
//============================================================