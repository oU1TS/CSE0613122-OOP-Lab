public class IfElseTest {

    public static void main(String[] args) {
        int number[] = {50,65,56,71,81};
        int even = 0, odd = 0;
        for(int i = 0;i<number.length;i++)
        {
            if((number[i]%2)==0)//decide even or odd
            {even += 1; //counting even number
            
            }
            else
            {
                odd +=1;//counting odd numbers
            }
        }
        System.out.println("Even numbers:" + even + "\nOdd numbers: "+ odd);
    }
    
}
