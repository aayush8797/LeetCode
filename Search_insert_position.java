import java.util.*;
public class Search_insert_position {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int target = sc.nextInt();
            int nums[] = {1,3,5,6,9,11};
            System.out.println(searchInsert(nums, target));
        }
    }
}
