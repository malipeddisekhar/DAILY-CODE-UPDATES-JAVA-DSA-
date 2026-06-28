//Practiceing the inputs for tcs 

// import java.util.*;
// class Testcases
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter bhai");
//         int n=sc.nextInt();
//         if(n==1000)
//         {
//             System.out.println("500");
//         }
//     }
// }



// import java.util.*;
// class Testcases
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter bhai");
//         int n=sc.nextInt();
//         if(n<0)
//         {
//             System.out.println("These is not a valid Input");
//             return;
//         }
//         if(n==1000||n==2000||n==8000||n==90)
//         {
//             System.out.println("500");
//         }else if(n==40)
//         {
//             System.out.println("800");
//         }else
//         {
//             System.out.println("Invalid Input");
//         }
//     }
// }



//Single number input
// import java.util.*;
// class Testcases
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the Number");
//         int n=sc.nextInt();
//         if(n>0)
//         {
//             System.out.println("Positive number");
//         }
//         else{
//             System.out.println("Negative");
//         }

//     }
// }


// 10
// 20
// 30
// 40 
// op:40
// import java.util.*;
// class Testcases
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int n=sc.nextInt();
//         System.out.println("Enter the Seconf number");
//         int m=sc.nextInt();
//         System.out.println("Enter the 3 number");
//         int o=sc.nextInt();
//         System.out.println("Enter the 4 number");
//         int p=sc.nextInt();
//         System.out.println(p);
//     }
//     }



// //10,20,30,40,50
// //By using the comma , we not use the integer Here insted of using the String
// import java.util.Scanner;
// class Testcases
// {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String input=sc.nextLine();
//         String[] arr=input.split(",");
//         for(String c:arr)
//         {
//             System.out.print(Integer.parseInt(c));
//         }
//     }
// }


// input:5
// 1 2 3 4 5
// {
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int []arr=new int[n];
//        for(int i=0;i<n;i++)
//         {
//           arr[i]=sc.nextInt();
//         }
//         // for (int i = 0; i < n; i++) {
//         //     System.out.println(arr[i]);
//         // }
//         for(int x:arr)//All the array values are given to x variab;es the x is directly print 
//         {
//             System.out.println(x);
//         }
//     }
// }

// //String without spaces
// class Testcases
// {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the Any string boss");
//         String input=sc.nextLine();//Here we use only the next in that there no white spaces is there 
//         System.out.println(input);
//     }
// }


//character input
// class Testcases
// {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the Any character boss");
//     char input=sc.next().charAt(0);//Here we use only the next in that there no white spaces is there 
//     System.out.println(input);
// }
// }


//Array Input in One Line  -->> these is the most important input in tcs.
// import java.util.*;
// class Testcases
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         for(int x:arr)
//         {
//             System.out.println(x);
//         }
//     }
// }





//Two arrays
// 5
// 1 2 3 4 5
// 6 7 8 9 10
import java.util.*;
// class Testcases
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int []arr1=new int[n];
//         int []arr2=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr1[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++)
//         {
//             arr2[i]=sc.nextInt();
//         }
//         for(int x:arr1)
//         {
//             System.out.println(x);
//         }
//         for(int y:arr2)
//         {
//             System.out.println(y);
//         }
//     }
// }


//Matrix Input
class Testcases
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}