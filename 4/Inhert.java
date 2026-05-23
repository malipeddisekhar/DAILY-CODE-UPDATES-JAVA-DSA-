// class Inhert{
//     void show(){
//         System.out.println("Inhert class");
//     }
//     class A extends Inhert{
//         void show(){
//             System.out.println("A class");
//         }
//     }
//     public static void main(String[] args) {
//         Inhert.A a = new Inhert().new A();
//         a.show();
//     }
// }



// class A{
//     void show(){
//         System.out.println("A class");
//     }
// }
// class B extends A{
//     void show(){
//         System.out.println("B class");
//     }
// }
// class C extends B{
//     void show(){
//         System.out.println("C class");
//     }
// }
// class Inhert{
// public static void main(String []args)
// {
//     C c = new C();
// }
// }



class A{
    A(){
        System.out.println("A constructor");
    }
}

class B extends A{
    B(){
        System.out.println("B constructor");
    }
}

class C extends B{
    C(){
        System.out.println("C constructor");
    }
}

class Inhert{
    public static void main(String []args)
    {
        C c = new C();
    }
}



