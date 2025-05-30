
package p07.finalterm;


// CASE 1: interface with abstract methods (no body, only declared)

/*interface Parent1{
    void fun(){ //error when no default access modifier
        System.out.println("Printed Parent1 interface\n");
    }
}
interface Parent2{
    void fun(); //error when no default access modifier
}
*/

// CASE 2: interface with default methods

interface Parent1{
    default void fun(){
        System.out.println("Printed Parent1 interface\n");
    }
}
/*interface Parent2{
    default void fun(){
        System.out.println("Printed Parent2 interface\n");
    }
}*/

// CASE 3: multiple inheritance with interface and class

class Parent2{
  public void fun(){
     System.out.println("Printed Parent2 class\n");
  }
}

// Main class for CASE 1 and 2

/*public class Main implements Parent2, Parent1{
    /*@Override
    public void fun(){ //printsonly Parent1 method
        System.out.println("Printed Parent1\n");
    }*/
 /*   @Override
    public void fun(){ //prints both interface methods
        Parent1.super.fun();
        Parent2.super.fun();
    }
    
    public static void main(String[] args) {
Main obj = new Main();
obj.fun();
    
    }
    
}*/

// Main class for CASE 3

public class Main extends Parent2 implements Parent1{


/*
    @Override
    public void fun(){
        System.out.println("Printed Parent1 main\n");
    }*/

@Override
    public void fun(){ //prints both interface methods
        Parent1.super.fun();
        super.fun();
        System.out.println("Method call finished");
    }
    
    public static void main(String[] args) {
Main obj = new Main();
obj.fun();
    
    }
    
}