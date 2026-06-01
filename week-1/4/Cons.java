class cons{

     String name;
     int age;
    cons()
    {
        System.out.println("Constructor is called Default");
    }
    cons(String name,int age)
    {
        this.name=name;
        this.age=age;
        System.out.println("Constructor is called Parameterized");
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        cons c1=new cons();
        cons c2=new cons("John",25);
        c1.display();
    }
}