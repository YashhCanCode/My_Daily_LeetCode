class maximum_subarray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int curr = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            if(curr + nums[i] > nums[i]){
                curr = nums[i] + curr;
            }
            else{
                curr = nums[i];
            }
            if(curr > max){
                max = curr;
            }
        }
    return max;
    }
}