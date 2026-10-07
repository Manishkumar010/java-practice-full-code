
public class selectionSort {
    public static void main(String[] args)
    {
        int nums[] = {5,3,5,8,2,4,9};
        int size = nums.length;

        System.out.println("Before sorting : ");
        for(int num : nums){
            System.out.print(num + " ");
        };

        for(int i = 1; i< size; i++)
        {
            int key = nums[i];
            int j = i-1;

            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j = j - 1;
            }
            nums[j+1] = key;
        }

        System.out.println();
        System.out.println("After sorting Array: ");
        for(int num : nums){
            System.out.print(num + " ");
        };
    }
}
