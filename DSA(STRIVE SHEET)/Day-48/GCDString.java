class GCDString {
    public String gcdOfStrings(String str1, String str2) {
         if(!(str1+str2).equals(str2+str1)){
         return "";
    }
    int len=findGCD(str1.length(),str2.length());
        return str1.substring(0,len);
    }
    public int findGCD(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        GCDString s = new GCDString();
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(s.gcdOfStrings(str1, str2)); // Output: "ABC"
    }
} 