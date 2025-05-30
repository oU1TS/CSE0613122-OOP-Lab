// demonstrate finally
class Main{
    //Through new RuntimeException out of the method.
    static void procA(){
        try{
          System.out.println("inside procA");
          throw new RuntimeException("demo");
        }finally{
            System.out.println("procA's finally");
        }
        
        
    }
    static void procB(){
        try{
            System.out.println("procB's finally");
           // return;
        }finally{
            System.out.println("procB's finally");
        }
        
    }
    //Execute a try block normally.
    static void procC(){
        try{
            System.out.println("inside procC");
        }finally {
            System.out.println("procC's finally");
        }
        
    }
    

    public static void main(String[] args) {
        
        try{
            
            procA();
        }catch(Exception e){
         System.out.println("Exception caught");   
        }
        procB();
        procC();
        
        
        
        
    }
    
}
