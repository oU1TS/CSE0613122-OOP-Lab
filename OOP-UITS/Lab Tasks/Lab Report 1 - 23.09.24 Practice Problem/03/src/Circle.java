
class Circle {

    double radius;
    double perimeter;

    Circle(double r) {
        radius = r;
        System.out.println("Area of Circle is = " + 3.1416 * r * r);
        System.out.println("Perimeter of Circle is = " + perimeter(radius) + "\n");
    }

    double perimeter(double r) {
        perimeter = 2 * 3.1416 * r;
        return perimeter;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        Circle c2 = new Circle(2.2);
        Circle c3 = new Circle(3.3);
    }
}
