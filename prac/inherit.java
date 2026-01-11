class X
{
    public void m1()
    {
        System.out.println("parent class");
    }
}
class Y extends X
{
    public void m2()
    {
        System.out.println("child class");
    }
}
class inherit
{
    public static void main (String[] args)
    {
        Y y = new Y();
        y.m1();
        y.m2();
    }
}