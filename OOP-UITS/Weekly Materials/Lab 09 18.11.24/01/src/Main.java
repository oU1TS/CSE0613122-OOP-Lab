
// InterfaceTest.java
interface Area // Interface Defined
{
    final static float pi = 3.14F;
    float compute (float x, float y);
}
class Rectangle implements Area //Interface Implementation
{
    @Override
    public float compute(float x, float y){
        
        return(x*y);
    }
}
class Circle implements Area //Another implementation
{
    public float compute(float x, float y)
    {
        return (pi*x*y);
    }
    
}
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle Cir = new Circle();
        Area area; // interface object
        area = rect; //area refers to rect object
        System.out.println("Area of Rectangle = "+area.compute(10,20)); 
        // area referes ro cir object
        area = Cir;
        System.out.println("Area of Circle = "+area.compute(10,10));
        
        
    }
    
}
