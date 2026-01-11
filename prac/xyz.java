class test
{
    private double balance=23;
    public double getBalance(){
        return balance;
    }

}
class xyz
{
    public static void main(String[] args)
    {
        test t = new test();
        double b = t.getBalance();
        System.out.println(b);
    }
}