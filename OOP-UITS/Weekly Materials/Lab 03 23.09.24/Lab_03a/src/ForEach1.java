//use a for- each style for loop
//sum of 10
//sum of 5
//largest(using logic or Java util Package / Stream

public class ForEach1 {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int big;
        //ise for-each style for to display and sum the values

        big = nums[0];
//for(int x : nums){
        for (int i = 0; i < 10; i++) {
            if (big < nums[i]) {
                big = nums[i];
            }
        }
        for (int x = 0; x < 5; x++) {
            System.out.println("value is: " + nums[x]);
            sum += nums[x];
        }
        System.out.println("Summmation : " + sum);
        System.out.println("largest : " + big);

    }

}
