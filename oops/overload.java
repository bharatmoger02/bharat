class overload {
    public void m1(){
        System.out.println("no-argument");
    }
    public void m1(int i){
        System.out.println("int-arg");
    }
    public void m1(double d){
        System.out.println("double-arg");
    }
    public static void main(String args[]){
        overload o = new overload();
        o.m1();
        o.m1(10);
        o.m1(20.5);
    }
}