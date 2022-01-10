class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum =0;
        for(int i=0;i<nums.length;i++)
            totalSum +=nums[i];
        int leftSum =0;
        for(int i=0;i<nums.length;i++){
            leftSum +=nums[i];
            if(leftSum*2==totalSum+nums[i]) 
                return i;     
        }
        return -1;
            
    }
}