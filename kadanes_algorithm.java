public class kadanes_algorithm {

    public static void max_sum(int num[]){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<num.length;i++){

            currSum += num[i];

            if(currSum < 0){
                currSum=0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Our Max Sum is : "+ maxSum);
    }

    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,-5,3};
        max_sum(num);
    }
} 