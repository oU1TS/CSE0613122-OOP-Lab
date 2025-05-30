class Car {

    String model;
    String color;
    int year;

    Car(String m,String c,int y) {
        model = m;
        color = c;
        year = y;
        System.out.println("model: "+model);
        System.out.println("color: "+color);
        System.out.println("year: "+year+"\n\n");

    }

    void gear() {
        System.out.println("Car gear shifted");
    }

    void stop() {
        System.out.println("Car Stropped");
    }

    void brake() {
        System.out.println("Car Brakes");
    }
}

public class Main {

    public static void main(String[] args) {
Car car1 = new Car("honda","red",2019);
Car car2 = new Car("audi","red",2020);
Car car3 = new Car("BMW","black",2021);
        
        
    }

}
