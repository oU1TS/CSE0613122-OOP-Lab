abstract class classA{
int A;
int B;
void methodA(){
    System.out.println("This is an abstract class\n");
}
}
interface classB{
    void methodB();
}
interface classC{
  void methodC(); 
}
class classD extends classA implements classB, classC{
    @Override
    public void methodB(){
    System.out.println("This is an inherited class of an interface\n");
}
    public void methodC(){
    System.out.println("This is an inherited class of another interface\n");
}
    void methodD(){
    System.out.println("This is the multiple inherited class\n");
}
    
}

public class Main {

    public static void main(String[] args) {
        classD D1 = new classD();
        D1.methodA();
        D1.methodB();
        D1.methodC();
        D1.methodD();
        
        
        
    }
    
}
