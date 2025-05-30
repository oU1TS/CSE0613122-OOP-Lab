
class Box {

    //float width;
    // float height;
    //float depth;
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Volume is ");
        System.out.println(width * height * depth);

    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}

class BoxDemo {

    BoxDemo() {
        System.out.println("An Object was Created");
    }

    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();
        Box mybox3 = new Box();
        BoxDemo mybox4 = new BoxDemo();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.volume();

        mybox3.setDim(3, 4, 5);
        mybox3.volume();

        //vol = mybox.width*mybox.height*mybox.depth;
        //System.out.println(vol);
    }

    private static BoxDemo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static BoxDemo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
