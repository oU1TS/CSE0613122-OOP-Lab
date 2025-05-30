abstract class Vehicle{
    abstract void start();
    abstract void stop();
    
}
class Car extends Vehicle{
    Car(){
   System.out.println("There is a Car here\n");}
    @Override
    void start(){
        System.out.println("Vehicle Starts\n");
        
    }
    @Override
    void stop(){
        System.out.println("Vehicle Stops\n");
        
    }
    
}
class Motorcycle extends Vehicle{
    Motorcycle(){
   System.out.println("There is a Motorcycle\n");}
    @Override
    void start(){
         System.out.println("Vehicle Starts\n");
        
    }
    @Override
     void stop(){
          System.out.println("Vehicle Stops\n");
         
     }
    
}
//class Driver{}

public class Driver {

    public static void main(String[] args) {
        Car C1 = new Car();
        Motorcycle M1 = new Motorcycle();
        C1.start(); M1.start();
        C1.stop(); M1.stop();
        
        
        
    }
    
}
