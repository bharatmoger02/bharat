class B {
    public void m1()
    {
        System.out.println("parent class");
    }
}

class C extends B {
    public void m2(){
        System.out.println("child class");
    }
}

class inherit{
    public static void main(String[] args)
    {
        C c = new C();
        c.m1();
        c.m2();
    }
}
