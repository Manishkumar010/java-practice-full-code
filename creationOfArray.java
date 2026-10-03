public class creationOfArray {
    public static void main(String[] args){
        // int num[] = {3,5,6,7};
        // num[1]=10;
        // System.out.println("Updated value at index 1: " + num[1]);


        int nums[] = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

       for(int i = 0; i < nums.length; i++){
           System.out.println("Value at index " + i + ": " + nums[i]);
       }
    }
}
