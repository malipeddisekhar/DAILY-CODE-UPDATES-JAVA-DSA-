// class MaxBalloons {
//     public int maxNumberOfBalloons(String text) {
//         int[] count = new int[26];
//         for (char c : text.toCharArray()) {
//             count[c - 'a']++;
//         }
//         int maxBalloons = Integer.MAX_VALUE;
//         maxBalloons = Math.min(maxBalloons, count['b' - 'a']);
//         maxBalloons = Math.min(maxBalloons, count['a' - 'a']);
//         maxBalloons = Math.min(maxBalloons, count['l' - 'a'] / 2);
//         maxBalloons = Math.min(maxBalloons, count['o' - 'a'] / 2);
//         maxBalloons = Math.min(maxBalloons, count['n' - 'a']);
//         return maxBalloons;
//     }
// }

import java.util.*;
class MaxBalloons
{
    public int maxNumberOfBalloons(String text) {
     TreeSet<Character> al = new TreeSet<>();
     for(int i=0;i<text.length();i++)
     {
         al.add(text.charAt(i));
     }
    int b=0,a=0,l=0,o=0,n=0;
    for(int i=0;i<text.length();i++)
    {
        if(text.charAt(i)=='b')
        {
            b++;
        }
        else if(text.charAt(i)=='a')
        {
            a++;
        }
        else if(text.charAt(i)=='l')
        {
            l++;
        }
        else if(text.charAt(i)=='o')
        {
            o++;
        }
        else if(text.charAt(i)=='n')
        {
            n++;
        }
    }
    l=l/2;
    o=o/2;
    int min=0;
    int am[] = {b,a,l,o,n};
    min=b;
    for(int i=0;i<am.length;i++)
    {
       min=Math.min(min,am[i]);
    }
    return min;
}
public static void main(String[] args) {
    MaxBalloons maxBalloons = new MaxBalloons();
    String text = "loonbalxballpoon";
    int result = maxBalloons.maxNumberOfBalloons(text);
    System.out.println(result);
}
}