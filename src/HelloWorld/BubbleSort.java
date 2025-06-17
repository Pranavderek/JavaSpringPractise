package HelloWorld;

public class BubbleSort
{
    public static void main(String[] args) {
        int[] nums = {100, 2, 34, 4, 45};

        // Bubble Sort logic
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
