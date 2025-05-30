class A{
    private int A = 11 ; // private
    public int B; // public
    public int getA(){
        System.out.println("This is Parent getter method\n");
        return A;
    }
    A(){
        this.B = 12;
    }
}
class B extends A{
    final int C = 13; // final
    private int D = 1400;
    @Override
    public int getA(){ // override here
        System.out.println("This is Child getter method\n");
        int Y = super.getA();
        return D+Y;
    }
}

class C extends B{
    
    int X = getA();
  void methodC(){
    System.out.println("and A,B,C = " + X + ", "+ B + ", "+ C);
    System.out.println("where A is private, \nB is Public and \nC is final");
  }
}

public class Overriding {
    public static void main(String[] args) {
        C c1 = new C();
        c1.methodC();
         
    }
}
