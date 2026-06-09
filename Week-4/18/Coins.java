import java.util.*;
class Coins
{
    public static void main(String [] args)
    {
     int coin[] = {1,10, 2, 5};
     int amount = 39;
     System.out.println(MinCoins(coin, amount));
    }
    public static int MinCoins(int [] coin, int amount)
    {
       Arrays.sort(coin);
         int count = 0;
         for(int i = coin.length - 1; i >= 0; i--)//we are starting from the last index because we want to use the largest coin first.
         {
             while(amount >= coin[i])
             {
                 amount -= coin[i];
                 count++;
             }
         }
         return count;
    }
}