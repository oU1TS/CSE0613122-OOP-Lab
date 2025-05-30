class A{
    private int A = 11 ; // private
    public int B; // public
    public int getA(){
        return A;
    }
    A(){
        this.B = 12;
    }
}
class B extends A{
    final int C = 13; // final
}

class C extends B{
    C(){
        System.out.println("This Constructor is not Overloaded");
    }
    C(int n){
        System.out.println("This Constructor is Overloaded with 1 parameter");
    }
    C(int n, int m){
        System.out.println("This Constructor is Overloaded with 2 parameters");
    }
    int X = getA();
  void methodC(){
    System.out.println("and A,B,C = " + X + ", "+ B + ", "+ C);
    System.out.println("where A is private, \nB is Public and \nC is final");
  }
}

public class Overloading {
    public static void main(String[] args) {
        C c1 = new C();
        c1.methodC();
         
    }
}
