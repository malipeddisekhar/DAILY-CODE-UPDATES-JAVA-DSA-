

// public class variables {
//     public static void main(String[] args) {

//         String name = "Sekhar";//It must be in string format
//         int age = 22;
//         double percentage = 85.5;
//         char grade = 'A';
//         boolean isPassed = true;

//         System.out.println("Student Name : " + name);
//         System.out.println("Age : " + age);
//         System.out.println("Percentage : " + percentage);
//         System.out.println("Grade : " + grade);
//         System.out.println("Pass Status : " + isPassed);

//     }
// }

// class variables{
//     public static void main(String [] args)
//     {
//       int a=10;
//       int b=20;
//       int sum=a+b;
//         System.err.println("The sum of a and b is : "+sum);
//     }
// }//By using these varibales we can perform various operations like addition, subtraction, multiplication, division etc. We can also use these variables to store user input and perform operations on them. Variables are essential in programming as they allow us to store and manipulate data effectively.


// import java.util.Scanner;//Scanner class are used to read the input from the user side.
// class variables{
//     public static void main(String []args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the first number : ");
//         int num=sc.nextInt();
//         System.out.println("Enter the second number : ");
//         int num2=sc.nextInt();
//         int sum=num+num2;
//         System.out.println("The sum of the two numbers is : "+sum);
//     }
// }


// //max//second largest number in an array
// class variables{
//     public static void main(String []args)
//     {
//         int arr[]= {10,20,30,40,50};
//         int max=arr[0];
//         for(int i=1;i<arr.length;i++)
//         {
//             if(arr[i]>max)
//             {
//                 max=arr[i];
//             }
//         }
//         System.out.println("The maximum number is : "+max);
//     }
//     int secondLargest(int arr[])
//     {
//         int max=arr[0];
//         int secondMax=Integer.MIN_VALUE;
//         for(int i=1;i<arr.length;i++)
//         {
//             if(arr[i]>max)
//             {
//                 secondMax=max;
//                 max=arr[i];
//             }
//             else if(arr[i]>secondMax && arr[i]!=max)
//             {
//                 secondMax=arr[i];
//             }
//         }
//         return secondMax;
//     }
// }



//Transpose if a matr