
public class Main01 {
public static void main(String[] args) {
    int x[] = {10,40,60,80,99}; // marks listed
    int n = 5; // number of marks
    System.out.println("Given Marks ranging from 0 to 100:");
    for(int i = 0; i <n;i++){
        System.out.println(x[i]);
    }
    System.out.println("");
    int x40=0;
    int x60=0;
    int x80=0;
    int x100=0;
        for(int i = 0; i <n;i++){
            if(x[i]>= 0 && x[i]<=40){
                x40++;
            }
            else if(x[i]>= 41 && x[i]<=60){
                x60++;
            }
            else if(x[i]>= 61 && x[i]<=80){
                x80++;
            }
            else if(x[i]>= 81 && x[i]<=100){
                x100++;
            }
            
        }
    System.out.println("Number oif students in the ranger of,\n");
    System.out.println("0 to 40 = " + x40);
    System.out.println("41 to 60 = " + x60);
    System.out.println("61 to 80 = " + x80);
    System.out.println("81 to 100 = " + x100);
    
    
    }
    
}
