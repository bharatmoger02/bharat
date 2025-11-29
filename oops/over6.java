class animal{}
class monkey extends animal{}
class over6
{
    public void m1(animal a)
    {
        System.out.println("animal");
    }
    public void m1(monkey m)
    {
        System.out.println("monkey");
    }
    public static void main(String[] args)
    {
        over6 o = new over6();
        animal a = new animal();
        o.m1(a);
        monkey m = new monkey();
        o.m1(m);
        animal a1 = new monkey();
        o.m1(a1);
    }
}