import java.util.HashMap;

public class Fruitbasket {

    public static int totalFruits(String[] fruits) {

        HashMap<String, Integer> map = new HashMap<>();

        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < fruits.length; end++) {

            map.put(fruits[end],
                    map.getOrDefault(fruits[end], 0) + 1);

            while (map.size() > 2) {

                map.put(fruits[start],
                        map.get(fruits[start]) - 1);

                if (map.get(fruits[start]) == 0) {
                    map.remove(fruits[start]);
                }

                start++;
            }

            maxLength = Math.max(maxLength,
                                 end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String[] fruits = {
            "Mango", "Mango", "Apple",
            "Banana", "Apple", "Banana",
            "Orange"
        };

        System.out.println(totalFruits(fruits));
    }
}