class Animal {
    // Final method cannot be overridden
final void sound() {
System.out.println("Animals makesounds.");
}
}

class Dog extends Animal {
    // Trying to override the final method will result ina compile-time error
    // void sound() { // This will cause anerror
// System.out.println("The dogbarks.");
    // }
}

public class finalMethod {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();
        // Output: Animals make sounds.

        Dog myDog = new Dog();
        myDog.sound();
        // Output: Animals make sounds.
    }
}