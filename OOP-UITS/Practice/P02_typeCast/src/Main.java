
public class Main {

    public static void main(String[] args) {

        int x = 5;
        int y = x;
        System.out.print(y);
        System.out.print(getObjectSize(y));//4 byte

        long z = x;
        System.out.print(z);
        System.out.print(getObjectSize(z)); //8 byte

    }

}
