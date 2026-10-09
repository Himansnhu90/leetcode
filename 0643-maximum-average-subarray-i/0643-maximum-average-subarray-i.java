class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int mSum = sum ;
        int j =0;

        for(int i=k;i<nums.length;i++){
            sum -= nums[j++];
            sum+=nums[i];
           mSum =    Math.max(mSum ,sum);
        }
        return (double)mSum/k;
        
    }
}