import java.util.Arrays;


class AgreCow {
    public static boolean place(int nums[], int k, int min){
        int cows = 1;
        int last = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] - last >= min){
                cows++;
                last = nums[i];
            }

        }
        if(cows >= k)return true;
        return false;
    }
    public static int aggressiveCows(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int val : nums){
            max = Math.max(max, val);
            min = Math.min(min, val);
        }
        Arrays.sort(nums);
        int i = 1;
        int j = max - min;
        int mid = 0;
        int ans = 0;
        while(i <= j){
            mid = i + (j - i)/2;
            if(place(nums, k, mid)){
                ans = mid;
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[]args){
        int a[] = {0, 3, 4, 7, 10, 9};
        System.out.print(aggressiveCows(a, 4));
    }


}
