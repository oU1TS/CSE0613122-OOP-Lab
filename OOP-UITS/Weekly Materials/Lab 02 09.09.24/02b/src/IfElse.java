
public class IfElse {

    public static void main(String[] args) {
        int i, count, count1, count2;
        float[] weight = {45f, 55f, 47f, 51f, 54f};
        float[] height = {176.5f, 174.2f, 168f, 170f, 169f};
        count = 0;
        count1 = 0;
        count2 = 0;
        for (i = 0; i <= 4; i++) {
            if (weight[i] < 50 && height[i] > 170) {
                count1 = count1 + 1;
            }
            count = count1 + 1; // Total persons
        }
        count2 = count + 1;
        System.out.println("Number of persons with ...");
        System.out.println("weight<50 and height > 170 = " + count1);
        System.out.println("Others = " + count2);

  
        
        
    }
}
