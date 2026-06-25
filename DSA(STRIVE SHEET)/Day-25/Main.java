class Main
{
    public static void main(String[] args)
    {
        int n=54321;
        while(n>0)
        {
            int rem=n%10;//It gives the last digit of the number
            System.out.println(rem);
            n=n/10;
        }
    }
}