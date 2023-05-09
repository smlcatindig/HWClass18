package class18;

public class A {

    void printA(){
         System.out.println("Class A is Parent Class");
     }
}
class B extends A {

    void printB(){
        System.out.println("Class B inherits from Class A");
    }

}
class C extends B {

    void printC() {
        System.out.println("Class C inherits from CLass B");
    }
}

    class ClassTester{
        public static void main(String[] args) {

            A a=new A();
            a.printA();

            B b=new B();
            b.printB();

           C c=new C();
           c.printC();


                }
            }


