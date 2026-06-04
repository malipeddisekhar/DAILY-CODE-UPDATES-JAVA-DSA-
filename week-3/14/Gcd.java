public class Gcd {
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(10,15));//calculation is a=10,b=15%10=5,a=5,b=10%5=0,so gcd is 5
    }
}
//=================================================
// //without recursion
// class Gcd {
//     public static void main(String[] args) {
//         int n = 10;
//         int m = 15;
//         while (m != 0) {
//             int temp = m;
//             m = n % m;
//             n = temp;

//         }
//         System.out.println(n);
//     }
// }