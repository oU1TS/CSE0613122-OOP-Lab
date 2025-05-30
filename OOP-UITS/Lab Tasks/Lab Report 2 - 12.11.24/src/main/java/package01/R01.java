package package01;

class D{
    int d;
    void displayD(int d){
        System.out.println("D :"+d);
    }
}

class A extends D{
    int x;
    void displayXD(int x){
        System.out.println("X + D: "+(x+d));
    }
}

//Implementing hybrid inheritance: Multi-level

class B extends A{
    int y;
    void displayXYD(int x,int y){
        System.out.println("X + Y + D: "+(x+y+d));
    }
}

//Implementing hybrid inheritance: Hierarchical

class C extends A{
    int z;
    void displayXZD(int x,int z){
        System.out.println("X + Z + D: "+(x+z+d));
    }
}

public class R01 {
    public static void main(String[] args) {
        A object1 = new A();
        B object2 = new B();
        C object3 = new C();
        D object4 = new D();
        object4.displayD(5);
        object1.displayXD(1);
        object2.displayXYD(1,2);
        object3.displayXZD(1,3);
    }
}
