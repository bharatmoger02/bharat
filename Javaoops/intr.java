interface Interf {
    public void m1();
    public void m2();
}

abstract class intr implements Interf //if you dont want to compile m2//
{
    public void m1(){    
    }
  //public void m2(){
  //}
}