
class Box {

    int num;
    double width;
    double height;
    double depth;

    /*Box(int n, double w, double h, double d) {
        num = n;
        width = w;
        height = h;
        depth = d;
        //double vol = width*height*depth; 
        //display(num,vol);
    }*/

   double setValue(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
        double vol = width*height*depth; 
        return vol;
    }
    /*double calc() {
        double vol = width * height * depth;
        return vol;
    }*/
    //void display(int n,double v){
    //  System.out.println("Volume of " +n+" no. Box is = "+ v +"\n");
    //}
    
}

public class BoxDemo {

    public static void main(String[] args) {
        Box B1 = new Box();
        Box B2 = new Box();
        Box B3 = new Box();
        Box B4 = new Box();
        Box B5 = new Box();
        /*Box B1 = new Box(1, 2, 3, 4);
        Box B2 = new Box(2, 5, 6, 7);
        Box B3 = new Box(3, 8, 9, 10);
        Box B4 = new Box(4, 11, 12, 13);
        Box B5 = new Box(5, 14, 15, 16);*/

        System.out.println("Volume of 1st Box is = "+ B1.setValue(2,3,4) +"\n");
        System.out.println("Volume of 2nd is Box = "+ B2.setValue(5,6,7) +"\n");
        System.out.println("Volume of 3rd is Box = "+ B3.setValue(8,9,10) +"\n");
        System.out.println("Volume of 4th is Box = "+ B4.setValue(11,12,13) +"\n");
        System.out.println("Volume of 5th is Box = "+ B5.setValue(14,15,16) +"\n");
    }

}
