class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length-1;
        for(int i = 0; i<k; i++){
            int m = nums[n];
            for(int j = n; j > 0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = m;
        }
    }
}  //time complixity



class Solution {
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int n = nums.length-1;
        k = k % nums.length;  // Handle cases where k is greater than array length
        reverse(nums,0,n);

        reverse(nums,k,n);

        reverse(nums,0,k-1);
    }
}
