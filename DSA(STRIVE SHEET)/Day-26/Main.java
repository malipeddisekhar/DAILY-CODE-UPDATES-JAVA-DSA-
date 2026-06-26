// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online

// class Main {
//     public static void main(String[] args) {
//         int n=2;
//         if(n%2==0)
//         {
//             System.out.println("Even");
//         }else
//         {
//             System.out.println("Odd");
//         }
//     }
// }

// class Main
// {
//     public static void main(String []args)
//     {
//         int n=0;
//         if(n>=0)
//         {
//             System.out.println("Positive");
//         }
//         else
//         {
//             System.out.println("_ve");
//         }
//     }
// }

// class Main
// {
//     public static void main(String []args)
//     {
//         int a=10,b=90,c=0;
//         if(a>=b && a>=c)
//         {
//             System.out.println("A is big");
//         }
//         else if(b>=a && b>=c)
//         {
//             System.out.println("B is big ");
//         }
//         else
//         {
//             System.out.println("c is big");
//         }
//     }
// }

// class Main
// {
//     public static void main(String[] args)
// {
//     int age=4;
//     if(age>=18)
//     {
//         System.out.println("Eligible");
//     }//Otherwise it can skip  not printing anything.
// }
// }

// class Main
// {
//     public static void main(String []args)
//     {
//         int a=34,b=64,c=90;
//         int largest = Math.max(a, Math.max(b, c));

// System.out.println(largest);
//     }
// }

// class Main
// {
//     public static void main(String[] args)
//     {
//         int marks=96;
//         if(marks>=90)
//         {
// System.out.println("Grade a");
//         }
//         else if(marks>=75)
//         {
//             System.out.println("Grade B");

//         }
//         else if(marks>=55)
//         {
//             System.out.println("Grade C");
//         }
//         else
//         {
//             System.out.println("Fail");
//         }

//     }
// }
// class Main
// {
//     public static void main(String[] args)
//     {
// int age = 20;
// boolean hasLicense = true;

// if(age >=18){

//     if(hasLicense){
//         System.out.println("Can Drive");
//     }
// }
// }
// }

// class Main
// {
//     public static void main(String[] args)
//     {
//         int year=2021;
//         if(year%4==0||year%400==0)
//         {
//             System.out.println("Leap year");
//         }
//         else
//         {
//             System.out.println("Not a leap year");
//         }
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         int day = 3;
//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             default:
//                 System.out.println("Invalid");
//         }
//     }
// }

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        System.out.println("Enter the Username to login");

        String name="Sekhar";
        String email="malipeddisekhar63@gmail.com";
        if(n==name)
        {
            System.out.println("Login success");
        }else
        {
            System.out.println("Invalid credentials");
        }
        sc.close();

    }
}