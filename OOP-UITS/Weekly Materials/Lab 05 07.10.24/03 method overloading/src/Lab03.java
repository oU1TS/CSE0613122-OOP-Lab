//with this keyword
class Overloaded {

    void test(){
        System.out.println("No Parameters");
    }
    void test(int a){
        System.out.println("a: "+a);
    }
    void test(int a, int b){
        System.out.println("a and b: "+a+" "+b);
    }
    double test(double a){
        System.out.println("double a: "+a);
        return a*a;
    }
    void display(double n){
        test(n);
    }
    void test(double d, String s,int i){
        System.out.println("\nTested: \ndouble: "+d+"\nString: "+s+"\nint: "+i);
    }
    Overloaded(){
        System.out.println("Constructor was called");
    }
}

public class Lab03 {

    public static void main(String[] args) {
        Overloaded ob = new Overloaded();
        System.out.println("\nreturn value assigned as result\n");
        double result = ob.test(5.0);
        ob.test();
        ob.test(10);
        ob.test(15,20);
        System.out.println("result: "+ result);
        ob.test(66.6,"TestString",999);


    }
}
