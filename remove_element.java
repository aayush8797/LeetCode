public class remove_element {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Counter for elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        // RemoveElement re = new RemoveElement();
        int[] nums = {3, 2, 2, 3 ,1 , 5};
        int val = 3;
        int k = removeElement(nums, val);

        System.out.println("Number of elements not equal to " + val + ": " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
