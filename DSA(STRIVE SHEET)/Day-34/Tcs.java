// import java.util.Scanner;
// class Tcs
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int max=arr[0];
//         int s_max=-1;
//         for(int i=1;i<arr.length;i++)
//         {
//             if(arr[i]>max)
//             {
//                 s_max=max;
//                 max=arr[i];
//             }
//             else if(s_max>arr[i]&&max!=arr[i])
//             {
//                 s_max=arr[i];
//             }
//         }
//         System.out.println(s_max);

//     }
// }


// import java.util.Scanner;
// class Tcs
// {
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int count=0;
//        while(n>0)
//        {
//         int rem=n%10;
//         n=n/10;
//         count++;
//        }
//        System.out.println(count);
//     }
// }

// import java.util.Scanner;
// class Tcs
// {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         while(n>0)
//         {
//             int rem=n%10;
//             n=n/10;
//              sum=sum+rem;
//         }
//         System.out.println(sum);

//     }
// }

// import java.util.Scanner;
// class Tcs
// {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int original=n;
//         int rev=0;
//         while(n>0)
//         {
//             int rem=n%10;
//             n=n/10;
//             rev=(rev*10)+rem;
//         }
//         if(rev==original)
//         {
//             System.out.println(rev+"The given numner is palindrome");
//         }
//         else{
//             System.out.println(rev+"The given number is not a palindrome");
//         }

//     }
// }


// //Anagram
// import java.util.Scanner;
// class Tcs
// {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int  n=sc.nextInt();
//         int original=n;
//         int sum=0;
//         while(n>0)
//         {
//             int rem=n%10;
//             sum=sum+(rem*rem*rem);
//             n=n/10;

//         }
//         if(original==sum)
//         {
//             System.out.println("Anagram you got it");
//         }
//         else
//         {
//             System.out.println("Not an Anagram Sorry");
//         }

//     }
// }


// class Tcs
// {
//     public static void main(String[] args) {
//         int n=5;
//         // if(n<=1)
//         // {
//         //  System.out.println("Not a prime number");
//         // }
//         for (int i = 2; i <= Math.sqrt(n); i++)
//              {
//                 if (n % i == 0) 
//                 {
//                     System.out.println("Not a prime number");
//                     return;
//                 }
//              }
//         System.out.println("Prime number");
//     }
// }


// class Tcs
// {
//     public static void main(String[] args)
//     {
//         int n=10;
//         if(n<=1)
//         {
//             System.out.println("Not a prime");
//         }
//         for(int i=2;i<n;i++)
//         {
//             if(n%i==0)
//             {
//                 System.out.println("Not a primt number");
//                 return;
//             }

//         }
//     System.out.println("Prime");

//     }
    

// }


// import java.util.Scanner;

// public class Tcs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         for (int num = 2; num <= n; num++) {

//             int count = 0;

//             for (int i = 1; i <= num; i++) {
//                 if (num % i == 0) {
//                     count++;
//                 }
//             }

//             if (count == 2) {
//                 System.out.print(num + " ");
//             }
//         }
//     }
// }



// class Tcs
// {
//     public static void main(String[] args)
//     {
//         int n=2;
//         if(n<=1)
//         {
//             System.out.println("Not a prime");
//         }
//         for(int i=2;i<n;i++)
//         {
//             if(n%i==0)
//             {
//                 System.out.println("Not a prime");
//                 return;
//             }
//         }
//         System.out.println("Prime");
//     }
// }



// class Tcs
// {
//     public static void main(String[] args)
//     {
//         int n=10;
//         if(n<=1)
//         {
//             System.out.println("Not a prime");
//         }
//         for(int i=2;i<n/2;i++)
//         {
//             if(n%i==0)
//             {
//                 System.out.println("Not a prime");
//                 return;
//             }
//         }
//         System.out.println("Prime");
//     }
// }

 
class Tcs
{
    public static void main(String[] args)
    {
        int n=1;
        if(n<=1)
        {
            System.out.println("Not a prime");
            return;
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.println("Not a prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}