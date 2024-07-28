import java.util.*;
public class Two_sum {
    public static int[] twoSum(int nums[], int target) {
        for (int i =1; i<nums.length ; i++){
            for (int j=i; j<nums.length ; j++){
                if(nums[j]+nums[j-1]==target){
                    return new int[] {j-1 , j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Target : ");
            int target = sc.nextInt();
            int nums[] = {2,7,11,15};
            System.out.println(Arrays.toString(twoSum(nums,target)));
        }
    }
} 
