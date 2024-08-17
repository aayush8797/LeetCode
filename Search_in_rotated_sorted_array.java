public class Search_in_rotated_sorted_array {
    public static int search(int[] nums, int X) {
        int left = 0, right = nums.length - 1;
        
        while(left<=right){
                
            int mid = (left+(right-left))/2;
            
            if(nums[mid] == X){
                return mid;
            }
            else if(nums[mid] < X){
                left = mid+1;
            }
            else if(nums[mid] > X){
                right = mid-1;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
}
