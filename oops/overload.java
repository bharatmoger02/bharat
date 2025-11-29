/*class overload {
    public void m1(){
        System.out.println("no-argument");
    }
    public void m1(int i){
        System.out.println("int-arg");
    }
    public void m1(float f){
        System.out.println("float-arg");
    }
    public static void main(String args[]){
        overload o = new overload();
        o.m1();
        o.m1(10);
        o.m1(20.5f);
        o.m1('b');
        o.m1(10l);
        //o.m1(10.5);
    }
}*/

class overload {
    public void m1(Object o){
        System.out.println("object version");
    }
    public void m1(String s){
        System.out.println("string version");
    }

    public static void main(String[] args)
    {
     overload o = new overload();
        o.m1(new Object());
        o.m1("string");
        o.m1(null);
    }
}