// class Math
// {
//     public static void main(String[] args)
//     {
//         int n=1234;
//         while(n>0)
//         {
//             int rem=n%10;
//             n=n/10;
//             System.out.print(rem);
//         }

//     }
// }

// class Math
// {
//     public static void main(String[] args)
//     {
//         int n=1234;
//         int count=0;
//         while(n>0)
//         {
//             int rem=n%10;
//             n=n/10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }//count the digits in a number


//Another manner
// class Main
// {
//     public static void main(String[] args)
//     {
//         int n = 1234;
//         int count = (int)(java.lang.Math.log10(n) + 1);
//         System.out.println(count);
//     }
// }


// class Main
// {
//     public static void main(String[] args)
//     {
//         int n=231000000;
       
//         while(n>0)
//         {
//             int rem=n%10;
//             n=n/10;
//             if(rem!=0)
//             {
//                 System.out.print(rem);
//             }
//         }
//     }
// }


//sum of digits in a number
// class Main
// {
//     public static void main(String[] args)
//     {
//         int n=1234;
//         int sum=0;
//         while(n>0)
//         {
//             int rem=n%10;
//             n=n/10;
//             sum=sum+rem;
//         }
//         System.out.println(sum);
//     }
// }


//Another manner
// class Main
// {
//     public static void main(String[] args)
//     {
//         int n=1234;
//         int sum=0;
//         while(n>0)
//         {
//             sum=sum+n%10;
//             n=n/10;
//         }
//         System.out.println(sum);
//     }
// }



// class Main
// {
//     public static void main(String[] args)
//     {
//         int n=121;
//         int original=n;
//         int rev=0;
//         while(n>0)
//         {
//             int rem=n%10;
//             rev=(rev*10)+rem;
//             n=n/10;
//         }
//         if(rev==original)
//         {
//             System.out.println("These is the palindrome");
//         }
//         else
//         {
//             System.out.println("these is not a palindrome");
//         }
//     }
//}



//Amstring number
// class Main
// {
//     public static void main(String[] args)
//     {
//         int n=153;
//         int original=n;
//         int sum=0;
//         while(n>0)
//         {
//             int rem=n%10;
//             sum=sum+(rem*rem*rem);
//             n=n/10;
//         }
//         if(sum==original)
//         {
//             System.out.println("These is the Amstrong number");
//         }
//         else
//         {
//             System.out.println("these is not a Amstrong number");
//         }
//     }
// }


class Main
{
    public static void main(String[] args)
    {
        int n=36;
         for(int i=1;i<n;i++)
         {
            if(n%i==0)
            {
                System.out.println(i);
            }
         }
    }
}