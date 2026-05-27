// //Normal code 
// class Errors {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;
//         int c = a / b; // This will work fine
//         System.out.println("Result: " + c);
//     }
// }

// =====================================================
// class Errors {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         int c = a / b; // This will throw an ArithmeticException
//         System.out.println("Result: " + c);
//      }
// }
// =====================================================

//Exception handling 
// class Errors {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         try {
//             int c = a / b; // This will throw an ArithmeticException
//             System.out.println("Result: " + c);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Cannot divide by zero.");
//         } finally {
//             System.out.println("This block will always execute.");
//         }
//     }
// }
// =====================================================
//Final keyword
// class Errors {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//         } catch (Exception e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//         final int a = 10; // 'a' is a constant and cannot be changed
//         // a = 20; // This will cause a compile-time error
//         System.out.println("Value of a: " + a);
//     }
// }

// =====================================================
// Common Exceptions in Java
// Exception	=====>Meaning
// ArithmeticException	=====>Divide by zero
// NullPointerException	=====>Using null object
// ArrayIndexOutOfBoundsException	=====>Wrong array index
// NumberFormatException	=====>Invalid number conversion
// FileNotFoundException	=====>File missing
// //====================================================
// class Errors {
//     public static void main(String[] args) {

//         try {

//             int arr[] = {1,2,3};

//             System.out.println(arr[9]);//Here find the exception then raise the pointer
//             // not go for the next line of code and directly jump to the catch block and
//             // print the message of the exception
//             int a = 10;
//             int b = 0;
//             int c = a / b; // This will throw an ArithmeticException

//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array Index out of bound  Error");
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic Error not divisible by zero");
//         }

//         catch (Exception e) {
//             System.out.println("General Exception");
//         }
//     }
// }
// =====================================================
//nested try-catch block
//Its similar to the nested if-else block
// class Errors {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//             int c = a / b; // This will throw an ArithmeticException
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic Error: Cannot divide by zero.");
//             try {
//                 int arr[] = { 1, 2, 3 };
//                 System.out.println(arr[9]); // This will throw an ArrayIndexOutOfBoundsException
//             } catch (ArrayIndexOutOfBoundsException ex) {
//                 System.out.println("Array Index out of bound Error");
//             }
//         }
//     }
// }
// =====================================================
//Throw and throws keyword
// class Errors {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//             if (b == 0) {
//                 throw new ArithmeticException("Cannot divide by zero."); // Manually throwing an exception
//             }
//             int c = a / b;
//         } catch (ArithmeticException e) {
//             System.out.println("Caught an exception: " + e.getMessage());
//         }
//     }
// }
// =====================================================
// Throw and throws keyword
// class Errors {
//     static void throwOne() throws IllegalAccessException {
//         throw new IllegalAccessException("This is an illegal access exception.");
//     }
//     public static void main(String[] args) {
//         try {
//             throwOne();
//         } catch (IllegalAccessException e) {
//             System.out.println("Caught an exception: " + e.getMessage());
//         }
// }
// }
// =====================================================
//Finally block
class Errors {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: Cannot divide by zero.");
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}