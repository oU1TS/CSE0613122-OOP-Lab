
public class Circle {

    double Area;
    double radius;

    double area(double radius) {
        double r = radius;
        Area = 3.1416 * r * r;
        return Area;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.radius = 2.2;
        c2.radius = 3.3;
        System.out.println("Area of 1st Circle is = " + c1.area(c1.radius));
        System.out.println("Area of 2nd Circle is = " + c2.area(c2.radius));

    }

}
