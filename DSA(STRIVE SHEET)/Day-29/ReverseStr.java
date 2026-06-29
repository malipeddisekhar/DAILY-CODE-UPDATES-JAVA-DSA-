class ReverseStr {
    public String reverseWords(String s) {
        s=s.trim();
        String[] words = s.split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            res.append(words[i]);
             if (i != 0) {
                res.append(" ");
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        ReverseStr obj=new ReverseStr();
        String s="  hello world  ";
        System.out.println(obj.reverseWords(s));
    }
}