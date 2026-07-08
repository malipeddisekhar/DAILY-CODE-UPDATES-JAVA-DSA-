// import java.util.Scanner;
// class Main
// {
//     public static void main(String[] args)

// {
//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    if(n<=1)
//    {
//     System.out.println("Not a prime number");
//     return;
//    }
//    for(int i=2;i<n;i++)
//    {
//     if(n%i==0)
//     {
//         System.out.println("Not a prime number");
//         return;
//     }
//    }
//    System.out.println("Prime number");
// }
// }

//fibonacci series
// class Main
// {
//     public static void main(String[] args)
//     {
//         int n1=0,n2=1,n3,i,count=10;
//         System.out.print(n1+" "+n2);
//         for(i=2;i<count;++i)
//         {
//             n3=n1+n2;
//             System.out.print(" "+n3);
//             n1=n2;
//             n2=n3;
//         }
//     }
// }




// class Main
// {
//     public static void main(String[] args)
//     {
//         int f=0,s=1,n=10;
//         System.out.print(f+" "+s);
//         for(int i=2;i<n;i++)
//         {
//             int th=f+s;
//             System.out.print(" "+th);
//             f=s;
//             s=th;
//         }
//     }
// }
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         while(n>0)
//         {
//             int rem=n%10;
//             System.out.print(rem);
//             n=n/10;
//         }
//     }
// }


// class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int c=0;
//         while(n>0)
//         {
//             int rem=n%10;
//             c++;
//             n=n/10;
//         }
//         System.out.println(c);
//     }
// }



// class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++)
//         {
//             boolean d=false;

//             for(int j=0;j<i;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     d=true;
//                     break;
//                 }
//             }
//             if(!d)
//             {
//                 System.out.print("After removing the Duplicates"+arr[i]+" ");
//             }
//         }
        
//     }
// }


// class Main{
//     public static void main(String[] args)
//     {
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       int arr[]=new int[n];
//       for(int i=0;i<n;i++)
//       {
//           arr[i]=sc.nextInt();
//       }
//       int max=arr[0];
//       int s_max=-1;
//       for(int i=1;i<arr.length;i++)
//       {
//       if(arr[i]>max)
//       {
//           s_max=max;
//           max=arr[i];
//       }
//       else if(s_max>arr[i]&&max!=arr[i])
//       {
//           s_max=arr[i];
//       }
//     }
//           System.out.println(s_max);

//     }
// }




// class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         for(int i=1;i<n;i++)
//         {
//             if(arr[i]<arr[i-1])
//             {
//                 System.out.println("Not sorted");
//                 break;
//             }
//          System.out.println("Sorted");
//          break;

//         }
        
//     }
// }


// class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         HashSet<Integer> set=new HashSet<>();//The set give only the unique values to reterive the information
//         for(int i=0;i<n;i++)
//         {
//             int num=sc.nextInt();
//             set.add(num);
//         }
//         for(int x:set)
//         {
//             System.out.println(x+" ");
//         }
//     }
// }


// class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<n;i++)
//         {
//             int num=sc.nextInt();
//             set.add(num);
//         }
//         for(int x:set)
//         {
//             System.out.println(x+" ");
//         }
//     }
// }



// import java.util.Scanner;
// class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++)
//         {
//             boolean duplicate=false;
//             for(int j=0;j<i;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     duplicate=true;
//                     break;
//                 }
//             }
//             if(!duplicate)
//             {
//                 System.out.print(arr[i]+"");
//             }
//         }
//     }
// }

// import java.util.*;
// class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<n;i++)
//         {
//             int num=sc.nextInt();
//             set.add(num);
//         }
//         for(int x:set)
//         {
//             System.out.println(x);
//         }
        
//     }
// }

// import java.util.Scanner;
// class Main{
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int j=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]!=0)
//             {
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//                 j++;
//             }
//         }
//         for(int i=0;i<n;i++)
//         {
//         System.out.println(arr[i]+" ");

//         }
//     }
// }


// import java.util.Scanner;
// class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int target=sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             for(int j=i+1;j<n;j++)
//             {
//                 if(arr[i]+arr[j]==target)
//                 {
//                     System.out.println(i+" "+j);
//                 }
//             }
//         }
//     }
// }

import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=n*(n+1)/2;
        int arrsum=0;
        for(int i=0;i<n-1;i++)
        {
            arrsum=arrsum+sc.nextInt();
        }
        System.out.println(sum-arrsum);
    }
}









// import java.util.Scanner;
// class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         int sum=n*(n+1)/2;
//         int arrsum=0;
//         for(int i=0;i<n-1;i++)
//         {
//             arrsum=arrsum+sc.nextInt();
//         }
//         System.out.println(sum-arrsum);
       
// }
// }

// import java.util.Scanner;

// class Main 
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int sum=0;
//         for(int i=0;i<n;i++)
//         {
//         sum+=arr[i];
//     }
//     System.out.println(sum);

//     }
// }



// import java.util.Scanner;
// class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n<=1)
//         {
//             System.out.println("Not a prime");
//             return;
            
//         }
//         boolean prime=false;
//         for(int i=2;i<n;i++)
//         {
//             if(n%i==0)
//             {
//                 System.out.println("Not a prime number");
//                 return;
//             }
//         }
//         System.out.println("Prime number");
//     }
    
// }









import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       if(n<=1)
       {
           System.out.println("Not a prime");
           return;
       }
       for(int i=2;i<=n;i++)
       {
           boolean prime=false;
           for(int j=2;j<i;j++)
           {
               if(i%j==0)
               {
                   prime=true;
                   break;
               }
           }
           if(prime)
           {
               System.out.print(i+" ");
           }
       }
       
}
}





// import java.util.*;
// class Main
// {
//     public static void main(String []args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<n;i++)
//         {
//             int num=sc.nextInt();
//             if(map.containsKey(num))
//             {
//                 map.put(num,map.get(num)+1);
//             }
//             else{
//                 map.put(num,1);
//             }
//         }
//         for(int key:map.keySet())
//         {
//             System.out.println(key+"=>"+map.get(key));
//         }
//     }
// }

// import java.util.Scanner;
// class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int target=sc.nextInt();
//         int low=0;
//         int high=n-1;
//         while(low<=high)
//         {
//             int mid =(low+high)/2;
//             if(arr[mid]==target)
//             {
//                 System.out.println("Elemnt founf mid"+mid);
//                 return;
//             }
//             else if(arr[mid]<target)
//             {
//                 low=mid+1;
//             }
//             else{
//                 high=mid-1;
//             }
//         }
//         System.out.println("Not found");
//     }
// }



import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='('|| ch=='{'||ch=='[')
            {
                st.push(ch);
            }
            else{
                if(st.isEmpty())
                {
                    System.out.println("Not valid");
                    return;
                }
                char top=st.pop();
                if((ch==')'&&top!='(')||(ch=='{'&&top!='}')||(ch==']'&&top!='['))
                {
                    System.out.println("invalid");
                    return;
                }
            }
        }
        if(st.isEmpty())
        {
            System.out.println("Valid");
        }
        else{
            System.out.println("not valid");
        }
    }
}
















