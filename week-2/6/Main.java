// abstract class Animal {
//     abstract void sound();

//     abstract void eat();

//     abstract void sleep();
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog is Barking");
//     }

//     void eat() {
//         System.out.println("Dog is Eating");
//     }

//     void sleep() {
//         System.out.println("Dog is Sleeping");
//     }
// }

// class Inter {
//     public static void main(String[] args) {
//         Dog d = new Dog();

//         d.sound();
//         d.eat();
//         d.sleep();
//     }
// }
// ============================================
// interface Phone {
//     void call();
// }

// interface Camera {
//     void capture();
// }

// class Smartphone implements Phone, Camera {
//     public void call() {
//         System.out.println("Making a call.");
//     }

//     public void capture() {
//         System.out.println("Capturing a photo.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Smartphone myPhone = new Smartphone();
//         myPhone.call(); // Output: Making a call.
//         myPhone.capture(); // Output:Capturing a photo.
//     }
// }
// =====================================================
interface Animal
{
    void sound();
}

class Parent
{
    void sleep()
    {
        System.out.println("Sleeping");
    }
}

class Dog extends Parent implements Animal
{
   public void sound()
   {
       System.out.println("Dog is Barking");
   }
}

class Main
{
    public static void main(String[] args)
    {
        Dog d = new Dog();

        d.sleep();
        d.sound();
    }
}