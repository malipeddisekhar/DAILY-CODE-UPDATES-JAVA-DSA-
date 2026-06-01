//Nth prime number
class prime{

    
    public static boolean isPrime(int num)
    {
        if(num<=1)
            return false;
        for(int i=2; i<=Math.sqrt(num); i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        int n=2;
        int count=0;
        int num=1;
        while(count<n)
        {
            num++;
            if(isPrime(num))
            {
                count++;
            }
        }
        System.out.println("The "+n+"th prime number is: "+num);
    }
}