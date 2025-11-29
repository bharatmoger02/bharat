class P {
    public void property()
    {
        System.out.println("cash and land");
    }
    public void marry()
    {
        System.out.println("girl1");
    }
}

class C extends P
{
    public void marry()
    {
        System.out.println("girl2");
    }
}

class overriding
{
    public static void main(String[] args)
    {
        P p = new P();
        p.marry();
        C c = new C();
        c.marry();
        P p1 = new C();
        p1.marry();
    }
}
