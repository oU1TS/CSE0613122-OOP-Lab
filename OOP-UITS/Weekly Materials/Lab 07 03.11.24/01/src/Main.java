
class A{
    int i;
     int j;
    //getter 
    void getA(){
        
    }
    //setter
    void setA(int x, int y){
        i = x;
        j = y;
    }
    void showij(){
        System.out.println("i and j: " + i + " " + j);
    }
}
class B extends A{
    int k;
    void showk(){
        
        System.out.println("k: "+k);
    }
    void sum(){
        System.out.println("i+j+k: "+(i+j+k));
    }
    
}
class C extends B{
    int l;
    void showl(){
        System.out.println("i+j+k+l: "+ (i+j+k+l));
    }
}
class D extends B{
    int m;
    void showm(){
       System.out.println("i+j+k+m: "+ (i+j+k+m)); 
    }
    
}
public class Main {
    public static void main(String[] args) {
        A SupOb = new A();
        B SubOb = new B();
        C SubOb2 = new C();
        D SubOb1 = new D();
       
        SupOb.i = 25;
        SupOb.j = 30;
        //SupOb.k = 15;
        SubOb.k = 35;
        SubOb.i = 5;
        SubOb.j = 10;
        
        SubOb2.i = 40;
        SubOb2.j = 45;
        SubOb2.k = 50;
        SubOb2.l = 55;
        
        SubOb1.i = 60;
        SubOb1.j = 65;
        SubOb1.k = 70;
        SubOb1.m = 75;
        
        SupOb.showij();
        SubOb.showk();
       
        SubOb2.showl();
        SubOb1.showm();
        
        
        
        
        
        
        
    }
    
}
