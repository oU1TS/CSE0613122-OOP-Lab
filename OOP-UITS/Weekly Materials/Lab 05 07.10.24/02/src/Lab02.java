//without this keyword
class Test {

    int roll;
    String name;
    float fee;

    Test(int roll, String name, float fee) {
        //this.roll = roll; //this.classVariable=Constructor Local Variable;
        //this.name = name;
        //this.fee = fee;
        roll = roll; //this.classVariable=Constructor Local Variable;
        name = name;
        fee = fee;
    }

    void display() {
        System.out.println(roll + " " + name + " " + fee);
    }
}

public class Lab02 {

    public static void main(String[] args) {
        Test s1 = new Test(111, "ankit", 5000f);
        Test s2 = new Test(112, "sumit", 6000f);
        s1.display();
        s2.display();

    }
}
