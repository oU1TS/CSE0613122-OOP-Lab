
public class CircleConst {

    double Area;
    double radius;

    CircleConst(double r) {
        radius = r;
        Area = 3.1416 * r * r;
        System.out.println("Area of Circle is = " + Area);
}
    
    public static void main(String[] args) {
        CircleConst r1 = new CircleConst(2.2);
        CircleConst r2 = new CircleConst(3.3);

    }

}
