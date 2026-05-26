//Method overloading
class Grandparent
{
    void display()
    {
        System.out.println("Grandparent class method");
    }
}

class Parent extends Grandparent
{
    void display()
    {
        System.out.println("Parent class method");
    }

    void showGrandparent()
    {
        super.display(); // Calls Grandparent method
    }
}

class Child extends Parent
{
    void display()
    {
        System.out.println("Child class method");
    }

    void callGrandparent()
    {
        showGrandparent();
    }
}

class overload
{
    public static void main(String[] args)
    {
        Child c = new Child();

        c.display(); // Child method

        c.callGrandparent(); // Grandparent method
    }
}