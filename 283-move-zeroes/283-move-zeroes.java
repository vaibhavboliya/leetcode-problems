class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return; 
        int count = 0;
        int idx = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0)
                nums[idx++] = nums[i];
            else
                count++;
        }
        for(int i =nums.length-1;i>nums.length-count-1;i--){
            nums[i] = 0;
        }
        
    }
}