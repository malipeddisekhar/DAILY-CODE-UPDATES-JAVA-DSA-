// class Recursion
// {
//     public static void main(String[] args)
//     {
//         int n = 5;
//         System.out.println(factorial(n));
//     }

//     public static int factorial(int n)
//     {
//         if (n == 0)
//             return 1;
//         else
//             return n * factorial(n - 1);
//     }
// }

// class Recursion
// {
//     public static void main(String[] args)
//     {
//        print1(5);
//     }

//     public static void print1(int n)
//     {
//         System.out.println(n);
//         print2(n - 1);
//        }
//     public static void print2(int n)
//     {
//         System.out.println(n);
//         print1(n - 1);
//             }
//             public static void print3(int n)
//     {        System.out.println(n);
//         print3(n - 1);
//     }
// }


class Recursion
{
    public static void main(String[] args)
    {
        int n = 1;
        System.out.println(factorial(n));   
    }

    public static int factorial(int n)
    {
        if(n==10)//If not written then the recursion will go on infinite and the stack memory will be full and the program will crash.
        {
          System.out.println("Recursion is stopped" + n);
          return 0;
        }
       System.out.println(n);
       return factorial(n + 1);
    }
}//The recursion is nothing but the function calling by itself the same function then it is called recursion.