public class DataType {
    public static void main(String[] args) {
        float a = 15f, b = 20.75f, c = 15f;
        
        System.out.println(" a = "+ a);
        System.out.println(" b = "+ b);
        System.out.println(" c = "+ c);
        System.out.println(" a+b = "+ (a+b));
        System.out.println(" a-b = "+ (a-b));
        System.out.println(" a*b = "+ (a*b));
        System.out.println(" a/b = "+ (a/b));
        System.out.println(" a%b = "+ (a%b));
        //Relation Operators
        System.out.println(" a < b = "+ (a<b));
        System.out.println(" a > b = "+ (a>b));
        System.out.println(" a == c = "+ (a==c));
        System.out.println(" a<=c = "+ (a<=c));
        System.out.println(" a>=b = "+ (a>=b));
        System.out.println(" b != c = "+ (b!=c));
        System.out.println(" b == a+c = "+ (b==a+c));
        //bool Logic
        boolean a1 = true, b1 = false;
        boolean c1 = a1 | b1;
        boolean d1 = a1 & b1;
        boolean e1 = a1 ^ b1;
        boolean f1 = (!a1 & b1) | (a1 & !b1);
        boolean g1 = !a1;
        System.out.println(" a1 = "+ a1);
        System.out.println(" a1 = "+ b1);
        System.out.println(" a1|b1 = "+ c1);
        System.out.println(" a1&b1 = "+ d1);
        System.out.println(" a1^b1 = "+ e1);
        System.out.println(" !a1&b1|a1&!b1 = "+ f1);
        System.out.println(" !a1 = "+ g1);
        //Increment Operator
        int m =10, n = 20;
        System.out.println(" m = "+ m);
        System.out.println(" n = "+ n);
        System.out.println(" ++m = "+ ++m);
        System.out.println(" n++ = "+ n++);
        System.out.println(" m = "+ m);
        System.out.println(" n = "+ n);
        
    }
    
}
