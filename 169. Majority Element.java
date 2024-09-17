class Solution {
    public int majorityElement(int[] nums) {
        int value = 1;
        int majority = nums[0];
        for (int i = 1; i < nums.length; i++){
            if(nums[i] == majority){
                value ++;
            }
            else if(nums[i] != majority){
                value --;
                if(value == 0){
                    majority = nums[i];
                    value ++;
                }
            }
        }   
        return majority;   
    }
}
