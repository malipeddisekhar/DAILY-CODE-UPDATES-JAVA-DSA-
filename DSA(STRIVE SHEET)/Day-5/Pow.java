class Pow
{
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        double ans = 1;
        while(n > 0){
            if((n & 1) == 1) ans *= x;
            x *= x;
            n >>= 1;
        }
        return ans;
    }
        public static void main(String[] args) {
            Pow p = new Pow();
            double x = 2.00000;
            int n = 10;
            System.out.println(p.myPow(x, n));
        }
    }
