
import java.util.Scanner;

class Rectangle {

    int length;
    int width;
    int depth;

    Rectangle(int l, int w, int d) {
        length = l;
        width = w;
        depth = d;
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int RectArea() {
        return (length * width);
    }

    int RectVol() {
        return (length * width * depth);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Input for Area:");
        Scanner S1 = new Scanner(System.in);
        int x = S1.nextInt();
        int y = S1.nextInt();
        int z = S1.nextInt();
        Rectangle R1 = new Rectangle(x, y, z);
         System.out.println("Input for Volume:");
        Scanner S2 = new Scanner(System.in);
        int a = S2.nextInt();
        int b = S2.nextInt();
        int c = S2.nextInt();
        Rectangle R2 = new Rectangle(a,b,c);
        int area = R1.RectArea();
        int vol = R2.RectVol();
        
        System.out.println("\n\n\nArea = " + area);
        System.out.println("Volume = " + vol+  "\n\n\n");
        

    }

}
