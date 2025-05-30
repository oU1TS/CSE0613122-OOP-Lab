//with this keyword
class Test {

    int roll;
    String name;
    float fee;

    void Test(int roll, String name, float fee) {
        this.roll = roll; //this.classVariable=Constructor Local Variable;
        this.name = name;
        this.fee = fee;
        //roll = roll; //this.classVariable=Constructor Local Variable;
        //name = name;
        //fee = fee;
    }

    void display() {
        System.out.println(roll + " " + name + " " + fee);
    }
}

public class Lab01 {

    public static void main(String[] args) {
        Test S1 = new Test(111, "ankit", 5000f);
        Test S2 = new Test(112, "sumit", 6000f);
        
        S1.display();
        S2.display();

    }
}
