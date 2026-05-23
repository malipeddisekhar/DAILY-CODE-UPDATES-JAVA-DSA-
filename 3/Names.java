// String in Java — Full Detailed Explanation

// Think like this first:

// A String is just a group of characters.

// Example:

// "Hello"
// "Java"
// "Sekhar"
// "123"

// All these are Strings because they are written inside double quotes " ".

// Real Life Example

// Suppose your name is:

// Sekhar

// Computer stores it as:

// Position	Character
// 0	S
// 1	e
// 2	k
// 3	h
// 4	a
// 5	r

// So String = collection of characters.

// Why Strings are Important

// Almost every application uses Strings.

// Examples:

// Login username
// Password
// Email
// Chat messages
// Search text
// Address
// Product names

// Without Strings, software cannot handle text.


// class Names{
//     public static void main(String[] args) {
//      String name1 = "Sekhar";
//         String name2 = "Sekhar";
//        System.out.println(name1 == name2); // true//Its compare the values and if same it returns true.
//        System.out.println(name1.equals(name2)); // true
//         // String name3 = new String("Sekhar");
//         // System.out.println(name1 == name3); // false
//         // System.out.println(name1.equals(name3)); // true
//         // return true;
//     }
// }


// class Names{
//     public static void main(String [] args)
//     {
//         String s=new String ("Sekhar");
//         String s2=new String("Sekhar");
//         System.out.println(s==s2);//false
//         System.out.println(s.equals(s2));//true
//     }
// }


//This is the example of string is immutable in java. It means once we create a string object we cannot change its value. If we try to change the value of a string object it will create a new string object with the new value and the old string object will remain unchanged.
// class Names{
//     public static void main(String [] args)
//     {
//     String name="Sekhar";
//     name.concat("bhai");
//     System.out.println(name);
// }
// }


// //But these is mutable manner perform
// class Names{
//     public static void main(String [] args)
//     {
//         StringBuilder name=new StringBuilder("Sekhar");
//         name=name.append(" bhai");
//         System.out.println(name);
//     }
// }

//methods
// class Names
// {
//     public static void main(String [] args)
//     {
//         String name="Sekhar";
//         System.out.println(name.length());//6
//         System.out.println(name.charAt(0));//S
//         System.out.println(name.charAt(5));//r
//         System.out.println(name.indexOf('k'));//2
//         System.out.println(name.substring(0,3));//Sek
//         System.out.println("Sekhar".equals("sekhar"));//false
//         System.out.println("Sekhar".equalsIgnoreCase("sekhar"));//true
//         System.out.println(name.toUpperCase());//SEKHAR
//         System.out.println(name.toLowerCase());//sekhar
//     }
// }


//Valid palindorme 
class Names {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }

            left++;
            right--;
        }

        return true;   
    }
    public static void main(String[] args) {
        Names obj = new Names();
        String s = "Madam";
        boolean result = obj.isPalindrome(s);
        System.out.println(result); // Output: true
    }
}