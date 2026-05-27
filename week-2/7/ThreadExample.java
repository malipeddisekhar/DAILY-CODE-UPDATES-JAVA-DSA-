// //Thread
// class Thread extends java.lang.Thread {
//     public void run() {
//         System.out.println("Thread is running");
//     }
//     void sleep() {
//         System.out.println("Thread is sleeping");
//     }
// }
// public class ThreadExample {
//     public static void main(String[] args) {
//         Thread t = new Thread();
//         t.start(); // This will call the run() method in a new thread
//         System.out.println("Main thread is running");
//         // Thread t1 = new Thread();
//         // t1.start(); // This will call the run() method in a new thread
//     }
// }

//=====================================================
//RUNNABLE
// class MyRunnable implements Runnable {

//     @Override
//     public void run() {
//         System.out.println("Runnable thread is running");
//     }
// }

// public class ThreadExample {

//     public static void main(String[] args) {

//         MyRunnable r = new MyRunnable();

//         Thread t = new Thread(r);

//         t.start();

//         System.out.println("Main thread is running");
//     }
// }//actual and formal argument lists differ in length//ERROR
//=====================================================
// class MyRunnable implements Runnable {

//     @Override
//     public void run() {
//         System.out.println("Runnable thread is running");
//     }
// }

// public class ThreadExample {

//     public static void main(String[] args) {
 
//         MyRunnable r = new MyRunnable();

//         java.lang.Thread t = new java.lang.Thread(r);

//         t.start();

//         System.out.println("Main thread is running");
//     }
// }
//=====================================================
// class MyRunnable implements Runnable 
class DigitThread extends Thread {

    public void run() {

        for(int i = 1; i <= 5; i++) {

            System.out.println(i);

            try {
                Thread.sleep(500);
            }

            catch(Exception e) {

            }
        }
    }
}

class LetterThread extends Thread {

    public void run() {

        for(char ch = 'A'; ch <= 'E'; ch++) {

            System.out.println(ch);

            try {
                Thread.sleep(500);
            }

            catch(Exception e) {

            }
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        DigitThread d = new DigitThread();

        LetterThread l = new LetterThread();

        d.start();

        l.start();
    }
}