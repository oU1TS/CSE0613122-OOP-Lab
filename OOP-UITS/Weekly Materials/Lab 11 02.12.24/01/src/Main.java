import java.util.*;

class Main{
    public static void main (String args[]){
        System.out.println("Enter value to be divided\n");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        System.out.println("Enter the divisor\n");
        int b = s1.nextInt();
        try{
            int x = a/b; // divided by zero
        System.out.println("x = "+x);
        }catch(ArithmeticException e){
                    System.out.println("x = infinity\n");
                    }
         //System.out.println("after catch");
        //int y = a/(b+c);
        //System.out.println("y = "+y);
        
    }
}