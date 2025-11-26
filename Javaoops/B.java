package pack2;
import pack1.A;
public class B extends A
{
    public static void main(String[] args)
    {
        A a = new A();
        //a.m1();

        B b = new B();
        b.m1();

        A a1= new B();
        //a1.m1();
    }
}