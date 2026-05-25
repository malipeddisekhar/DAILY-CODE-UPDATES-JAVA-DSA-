// class Cons {
//     String name;
//     int age;
//     Cons(){
//         this("Guest", 0);
//         this.name = "Unknown";
//     }
//     Cons(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     public static void main(String[] args) {
//         Cons c1 = new Cons();
//         System.out.println("Name: " + c1.name);
//         System.out.println("Age: " + c1.age);        
//     }
// }



// class A{
//     String name;
//     A(String name){
//         this.name = name;
//         System.out.println("A constructor");
//     }
// class B extends A{
//     B(){
//         super("B");
//         System.out.println("B constructor");
//     }
// }
// class Cons{
//     Public static void main(String[] args) {
//         B b = new B();
//     }
// }
// }

//Method overriding 
class over
{
    void display()
    {
      System.out.println("Parent class method");
    }
}
class over1 extends over
{
    void display()
    {
        System.out.println("Child class method");
    }
}
public class Cons {
    public static void main(String[] args) {
        over o = new over();
        o.display();
        o = new over1();//Late binding
        o.display();//Overriding method will be called

        //These is the calling from parent class reference variable and object of child class so its executing the child class method because of late binding
        //but the child class method is overriding the parent class method so it will execute the child class method
        //In object creation the referenece object id child to parent it will not execute its code.

    }
}