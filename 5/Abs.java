//Abstract class
abstract class Ab
{
    abstract void display();//if we declare any method as abstract then the class must be declared as abstract and we cannot create object of abstract class and also we have to override the abstract method in subclass otherwise we will get compile time error  
    abstract void show();
}
class Abs1 extends Ab
{
    @Override
    void display()
    {
        System.out.println("Abstract class method");
    }

    @Override
    void show()
    {
        System.out.println("Abstract class show method");
    }
}

class Abs {
    public static void main(String[] args) {
        Abs1 a = new Abs1();
        a.display();
        a.show();
    }
}
