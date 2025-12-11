class Test {
    Test(double d)
    {
        this(10);
        System.out.println("double-arg cons");
    }
    Test(int i)
    {
        this();
        System.out.println("int-arg");
    }
    Test()
    {
        System.out.println("no-arg");
    }
    public static void main(String[] args)
    {
        Test t1 = new Test(10.5);
    }
}