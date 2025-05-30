class Box{
    int width;
    int height;
    int depth;
    Box(){
      width = 3;  
    }
    Box(int w){
        width = w;
    }
    Box(int w, int h){
        width = w;
        height = h;
    }
    Box(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }

    void myMethod(){
        if(height == 0 && depth == 0)
        {
            System.out.println("The Dimension of Box with only width is = " + 1 + "\nand Width is = "+width+"\n");
        
        }
        else if(depth == 0){
            System.out.println("The Dimension of Box with width and height is = " + 2);
        Area(width,height);
        }
        else {
            System.out.println("The Dimension of Box with width, height and depth is = " + 3);
        Volume(width,height,depth);
        }
    
    }
        void Area(int a, int b){
        int area = a*b;
        System.out.println("Area of this Box is = "+area);
        
    }
        void Volume(int a, int b,int c){
        int volume = a*b*c;
        System.out.println("Volume of this Box is = "+volume);
        
    }
    }
 
public class Main02 {
public static void main(String[] args) {
        Box B1 = new Box();
        Box B2 = new Box(3,4,5);
        B1.myMethod();
        B2.myMethod();
    }
    
}
